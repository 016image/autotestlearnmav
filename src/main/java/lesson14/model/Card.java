package lesson14.model;

public class Card {
    private String type;
    private String cardNumber;
    private String endDateMonth;
    private String endDateYear;
    private String code;
    private String accountNumber;

    public Card() {
    }

    public Card(String type, String cardNumber, String endDateMonth, String endDateYear, String code, String accountNumber) {
        this.type = type;
        this.cardNumber = cardNumber;
        this.endDateMonth = endDateMonth;
        this.endDateYear = endDateYear;
        this.code = code;
        this.accountNumber = accountNumber;
    }

    public Card setType(String type) {
        this.type = type;
        return this;
    }

    public Card setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public Card setEndDateMonth(String endDateMonth) {
        this.endDateMonth = endDateMonth;
        return this;
    }

    public Card setEndDateYear(String endDateYear) {
        this.endDateYear = endDateYear;
        return this;
    }

    public Card setCode(String code) {
        this.code = code;
        return this;
    }

    public Card setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public String getType() {
        return type;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getEndDateMonth() {
        return endDateMonth;
    }

    public String getEndDateYear() {
        return endDateYear;
    }

    public String getCode() {
        return code;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
