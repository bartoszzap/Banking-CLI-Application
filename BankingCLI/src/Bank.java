import java.util.HashMap;
import java.util.UUID;

public class Bank {
    private HashMap<String, Account> accounts = new HashMap<>();

    public String createAccount(String name) {
        String uniqueNum = UUID.randomUUID().toString();

        Account newAccount = new Account(uniqueNum, name);
        this.accounts.put(uniqueNum, newAccount);

        return uniqueNum;
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public boolean performDeposit(String accNum, double amount) {
        Account account = getAccount(accNum);
        if (account == null) {
            System.out.println("Account not found.");
            return false;
        }
        return account.deposit(amount);
    }

    public boolean performWithdrawal(String accNum, double amount) {
        Account account = getAccount(accNum);
        if (account == null) {
            System.out.println("Account not found.");
            return false;
        }

        return account.withdraw(amount);
    }
}
