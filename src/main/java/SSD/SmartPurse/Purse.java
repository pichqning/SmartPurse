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
                currencyS = "Baht";
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
                currencyS = "Pound";
                break;
            case 6:
                currencyS = "yuan";
                break;

            default:
                currencyS = new NullMoney(0).getCurrency();

        }
        return currencyS;
    }

    public void showSpecific(int choice) {
        try {
            String SpecificCurr = checkCurrency(choice);

            double summation = 0;
            for (int i = 0; i < moneyList.size(); i++) {
                if (moneyList.get(i).getCurrency().equalsIgnoreCase(SpecificCurr)) {
                    summation += moneyList.get(i).getValue();
                    System.out.println(moneyList.get(i).toString());
                }
            }
            System.out.println("Amount: " + summation + " " + SpecificCurr);

        } catch (Exception e) {
            System.out.println("Undefined command.");
        }
    }

    public void deposit(double value, String curr) {
        int oldSize = moneyList.size();
        for (int i = 0; i < moneyList.size(); i++) {
            if (moneyList.get(i).getValue() == value && moneyList.get(i).getCurrency().equalsIgnoreCase(curr)) {
                moneyList.remove(i);
                System.out.println("Deposit " + moneyList.get(i).getValue() + " " + moneyList.get(i).getCurrency() + " Successful");
            }
        }

        if (oldSize == moneyList.size()) System.out.println("No " + value + " " + curr + " in your purse.");

    }

    public void convert(int choice) {
        switch (choice) {
            case 1:
                this.calculator = new THCalculator();
                break;
            case 2:
                this.calculator = new KRCalculator();
                break;
            case 3:
                this.calculator = new JPCalculator();
                break;
            case 4:
                this.calculator = new USCalculator();
                break;
            case 5:
                this.calculator = new UKCalculator();
                break;
            case 6:
                this.calculator = new CHCalculator();
                break;

            default:
                this.calculator = new THCalculator();
        }

        Money convertMoney = calculator.convert(moneyList);
        System.out.println(convertMoney.toString());
    }
}
