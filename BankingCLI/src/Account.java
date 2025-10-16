public class Account {
    private final String accountNumber;
    private final String accountHolderName;
    private double balance;

    public Account(String accNum, String accHolder) {
        accountNumber = accNum;
        accountHolderName = accHolder;
        balance = 0.0;
    }

    public boolean deposit(double bal) {
        if (bal > 0) {
            balance += bal;
            return true;
        }
        return false;
    }

    public boolean withdraw(double bal) {
        if (bal > 0) {
            if (bal <= balance) {
                balance -= bal;
                return true;
            }
        }
        return false;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void getDetails() {
        System.out.println("The account: '" + getAccountNumber() + "', has a balance of £" + getBalance() + ".");
    }
}
