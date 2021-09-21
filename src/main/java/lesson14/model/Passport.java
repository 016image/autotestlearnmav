package lesson14.model;

public class Passport {
    private String series;
    private String number;
    private String issuer;
    private String issueDate;
    private String issuerCode;

    public Passport() {
    }

    public Passport(String series, String number, String issuer, String issueDate, String issuerCode) {
        this.series = series;
        this.number = number;
        this.issuer = issuer;
        this.issueDate = issueDate;
        this.issuerCode = issuerCode;
    }

    public Passport setSeries(String series) {
        this.series = series;
        return this;
    }

    public Passport setNumber(String number) {
        this.number = number;
        return this;
    }

    public Passport setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    public Passport setIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    public Passport setIssuerCode(String issuerCode) {
        this.issuerCode = issuerCode;
        return this;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getIssuerCode() {
        return issuerCode;
    }
}