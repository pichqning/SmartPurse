package SSD.SmartPurse;

import java.util.ArrayList;
import java.util.List;

public class Purse {
    public static Purse instance;
    public List<Money> moneyList;
    private Calculator calculator;

    public static Purse getInstance() {
        if (instance == null) {
            instance = new Purse();
        }
        return instance;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public Purse() {
        moneyList = new ArrayList<Money>();
        calculator = new THCalculator();
    }

    public List<Money> getMoneyList() {
        return moneyList;
    }

    public void addMoney(double value, String curr) {

        if (value > 0) {

            if (curr.equalsIgnoreCase("baht")) {
                moneyList.add(new THMoney(value));
                System.out.println("Successfully add " + value + " " + curr);
            } else if (curr.equalsIgnoreCase("yen")) {
                moneyList.add(new JPMoney(value));
                System.out.println("Successfully add " + value + " " + curr);
            } else if (curr.equalsIgnoreCase("dollar")) {
                moneyList.add(new USAMoney(value));
                System.out.println("Successfully add " + value + " " + curr);
            } else if (curr.equalsIgnoreCase("pound")) {
                moneyList.add(new UKMoney(value));
                System.out.println("Successfully add " + value + " " + curr);
            } else if (curr.equalsIgnoreCase("yuan")) {
                moneyList.add(new CHMoney(value));
                System.out.println("Successfully add " + value + " " + curr);
            } else if (curr.equalsIgnoreCase("won")) {
                moneyList.add(new KRMoney(value));
                System.out.println("Successfully add " + value + " " + curr);
            } else System.out.println("Sorry this currency is undefined yet.");

        } else {
            System.out.println("Please input correct value of money.");
        }

    }

    public void showAllMoney() {
        for (int i = 0; i < moneyList.size(); i++) {
            System.out.println(moneyList.get(i).toString());
        }
    }

    private String checkCurrency(int choice) {
        String currencyS = "";
        switch (choice) {
            case 1:
                currencyS = "baht";
                break;
            case 2:
                currencyS = "won";
                break;
            case 3:
                currencyS = "yen";
                break;
            case 4:
                currencyS = "dollar";
                break;
            case 5:
                currencyS = "pound";
                break;
            case 6:
                currencyS = "yuan";
                break;

            default:
                currencyS = new NullMoney(0).getCurrency();

        }
        return currencyS;
    }

    public String showSpecificByCur (String SpecificCurr) {
        double summation = 0.000;
        for (int i = 0; i < moneyList.size(); i++) {
            if (moneyList.get(i).getCurrency().equalsIgnoreCase(SpecificCurr)) {
                summation += moneyList.get(i).getValue();
                System.out.println(moneyList.get(i).toString());
            }
        }
        return String.format("%.3f %s" , summation,SpecificCurr);
    }

    public String showSpecific(int choice) {
        try {
            String SpecificCurr = checkCurrency(choice);
            return showSpecificByCur(SpecificCurr);

        } catch (Exception e) {
            System.out.println("Undefined command.");
        }
        return new NullMoney(0).toString();
    }

    public Money deposit(double value, String curr) {
        int oldSize = moneyList.size();
        for (int i = 0; i < moneyList.size(); i++) {
            if (moneyList.get(i).getValue() == value && moneyList.get(i).getCurrency().equalsIgnoreCase(curr)) {
                System.out.println("Deposit " + moneyList.get(i).getValue() + " " + moneyList.get(i).getCurrency() + " Successful");
                Money money = moneyList.get(i);
                moneyList.remove(i);
                return money;
            }
        }

        if (oldSize == moneyList.size()) System.out.println("No " + value + " " + curr + " in your purse.");
        return new NullMoney(0);
    }

    public Money convert(int choice) {
        String curr = checkCurrency(choice);
        return convertMoney(curr);
    }

    public Money convertMoney (String curr) {
        switch (curr) {
            case "baht":
                this.calculator = new THCalculator();
                break;
            case "won":
                this.calculator = new KRCalculator();
                break;
            case "yen":
                this.calculator = new JPCalculator();
                break;
            case "dollar":
                this.calculator = new USCalculator();
                break;
            case "pound":
                this.calculator = new UKCalculator();
                break;
            case "yuan":
                this.calculator = new CHCalculator();
                break;

            default:
                this.calculator = new THCalculator();
        }

        Money convertMoney = calculator.convert(moneyList);
        return convertMoney;
    }

    public void removeAll() {
        this.moneyList.clear();
    }
}
