import java.util.HashMap;
import java.util.UUID;

public class Bank {
    private HashMap<String, Account> accounts = new HashMap<>();

    public void createAccount(String name) {
        String uniqueNum = UUID.randomUUID().toString();

        Account newAccount = new Account(uniqueNum, name);
        this.accounts.put(uniqueNum, newAccount);
    }

    public Account getAccount(String accountNumber) {
        return
    }
}
