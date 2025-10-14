import java.util.Scanner;

public class BankApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Bank bank = new Bank();

    public static void main(String[] args) {
        System.out.println("Welcome to the Bank of Ulster!");

        int choice;
        do {
            showMenu();
            choice = getInteger("Choose an option: ");
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

        } while (choice != 5);
        System.out.println("Thank you for banking with us!");
        scanner.close();
    }

    private static void showMenu() {
        System.out.println("--- Menu ---");
        System.out.println("1. Create a new account");
        System.out.println("2. Deposit funds");
        System.out.println("3. Withdraw funds");
        System.out.println("4. Check balance");
        System.out.println("5. Exit");
        System.out.println("--------");
    }

    private static int getInteger(String option) {
        System.out.println(option);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input, please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static int getDouble(String option) {
        System.out.println(option);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input, please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                createAccount();
                break;
            case 2:
                depositFunds();
                break;
            case 3:
                withdrawFunds();
                break;
            case 4:
                checkBalance();
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid option. Please select a number from the menu (1-5).");
        }
    }

    private static void createAccount() {
        System.out.println("Enter account holder name: ");
        String name = scanner.nextLine();
        bank.createAccount(name);
    }

    private static void depositFunds() {
        System.out.println("Enter the amount of funds you'd like to deposit: £");

        String accNum = scanner.nextLine();

        double amount = getDouble("Enter the amount of funds you'd like to deposit: £");
        bank.performDeposit(accNum, amount);
    }
}
