package SSD.SmartPurse;

import java.util.Scanner;

public class App {
    private Purse purse;

    public static App instance;

    public App() {
        purse = Purse.getInstance();
    }

    public static App getInstance() {
        if (instance == null) {
            instance = new App();
        }
        return instance;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        String input;
        double money;
        String curr;
        System.out.println("Welcome to Smartpurse!");
        while (running) {
            printMenu();
            System.out.print("Selected: ");
            input = scanner.next();

            if (input.length() > 1 || input == "") {
                input = "0";
            }

            switch (Integer.parseInt(input)) {

                case 0:
                    System.out.println("Please rerun the program.");
                    break;
                    /**
                     * addMoney
                     * */
                case 1:
                    boolean addmoneyRunning = true;
                    while (addmoneyRunning) {
                        System.out.println("\n** Exit: Input -1 to money");
                        System.out.print("Please Input Money with currency (ex. 100 baht): ");
                        money = scanner.nextDouble();
                        if (money == -1) {
                            addmoneyRunning = false;
                            System.out.println();
                            break;
                        }

                        curr = scanner.next();
                        purse.addMoney(money, curr);

                    }
                    break;

                /**
                 *  Deposit
                 */
                case 2:
                    boolean depositRunning = true;
                    while (depositRunning) {
                        System.out.println("\n** Exit: Input -1 to money");
                        System.out.print("Please Input Money with currency (ex. 100 baht): ");
                        money = scanner.nextDouble();
                        if (money == -1) {
                            addmoneyRunning = false;
                            System.out.println();
                            break;
                        }
                        curr = scanner.next();
                        purse.deposit(money, curr);

                    }
                    break;
                    /**
                     * Show all money
                     * */
                case 3:
                    System.out.println("-----------------------");
                    purse.showAllMoney();
                    System.out.println("-----------------------");
                    break;
                /**
                 * Show specific currency
                  */
                case 4:
                    boolean showMoneyRunning = true;
                    while (showMoneyRunning) {
                        printConvertMenu();
                        System.out.print("Selected: ");
                        input = scanner.next();
                        if (Integer.parseInt(input) == 7) {
                            showMoneyRunning = false;
                            System.out.println();
                            break;
                        }
                        System.out.println("----------");
                        String amount = purse.showSpecific(Integer.parseInt(input));
                        System.out.println("Amount: " + amount);
                        System.out.println("----------");
                    }
                    System.out.println();
                    break;

                case 5:
                    printConvertMenu();
                    System.out.print("Selected: ");
                    input = scanner.next();
                    Money outcome = purse.convert(Integer.parseInt(input));
                    System.out.println(outcome.toString());
                    System.out.println("----------");
                    System.out.println();
                    break;

                case 6:
                    purse.removeAll();
                    System.out.println("Successfully remove all money.");
                    break;

                    default:
                    System.out.println("Thanks!");
                    running = false;

            }
        }


    }


    public static void printMenu() {
        System.out.println("----- Please select function -----");
        System.out.println("1. Add money");
        System.out.println("2. Deposit");
        System.out.println("3. Show all Money");
        System.out.println("4. Show specific currency");
        System.out.println("5. Visual convert currency");
        System.out.println("6. Empty the purse");
        System.out.println("7. Exit");
    }

    public static void printConvertMenu() {
        System.out.println("----- Please select wanted currency ------");
        System.out.println("1. TH_BATH");
        System.out.println("2. KR_WON");
        System.out.println("3. JP_YEN");
        System.out.println("4. US_DOLLAR");
        System.out.println("5. UK_POUND");
        System.out.println("6. CH_YUAN");
        System.out.println("7. Back to main menu");
    }


    public static void main(String[] args) {
        App app = App.getInstance();
        app.start();

    }
}
