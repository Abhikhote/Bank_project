package Bank_project_package;

public class Customer {
    private final long accountNumber;
    private final String accountName;
    private double accountBalance;

    public Customer(long accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    @Override
    public String toString() {
        return "Customer{" + "accountNumber=" + accountNumber + ", accountName='" + accountName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}