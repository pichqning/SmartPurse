package SSD.SmartPurse;

import java.util.ArrayList;
import java.util.List;

public class Purse {
    public static Purse instance;
    public List<Money> moneyList;

    public static Purse getInstance() {
        if (instance == null) {
            instance = new Purse();
        }
        return instance;
    }

    public Purse() {
        moneyList = new ArrayList<Money>();
    }

    public List<Money> getMoneyList() {
        return moneyList;
    }

    public void addMoney(int value, String curr) {

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

            int summation = 0;
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

    public void deposit (int value , String curr) {
        int oldSize = moneyList.size();
        for (int i = 0 ; i < moneyList.size() ; i++) {
            if (moneyList.get(i).getValue() == value && moneyList.get(i).getCurrency().equalsIgnoreCase(curr)) {
                moneyList.remove(i);
                System.out.println("Deposit " + moneyList.get(i).getValue() + " " + moneyList.get(i).getCurrency() + " Successful");
            }
        }

        if (oldSize == moneyList.size()) System.out.println("No " + value + " " + curr + " in your purse.");

    }
}
