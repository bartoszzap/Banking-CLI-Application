public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accNum, String accHolder) {
        accountNumber = accNum;
        accountHolderName = accHolder;
        balance = 0.0;
    }

    public void deposit(int bal) {
        if (bal > 0) {
            balance += bal;
        }
    }

    public void withdraw(int bal) {
        if (bal > 0) {
            if (bal <= balance) {
                balance -= bal;
            }
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getDetails() {
        return "The account: '" + getAccountNumber() + "', has a balance of " + getBalance() + ".";
    }
}
