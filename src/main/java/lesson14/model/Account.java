package lesson14.model;

public class Account {
    private String accountType;
    private String accountNumber;
    private Double accountBalance;

    public Account() {
    }

    public Account(String accountType, String accountNumber, Double accountBalance) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public Account setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    public Account setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public Account setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }
}
