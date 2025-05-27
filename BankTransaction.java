public class BankTransaction {
    private String accountName;
    private String accountholderName;
    private String accountType; // e.g., "saving", "business"
    private String accountNumber;
    private double balance;

    public BankTransaction(String accountName, String accountholderName, String accountType, String accountNumber, double balance) {
        this.accountName = accountName;
        this.accountholderName = accountholderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters (optional)
    public String getAccountName() {
        return accountName;
    }

    public String getAccountholderName() {
        return accountholderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "accountName='" + accountName + '\'' +
                ", accountholderName='" + accountholderName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}