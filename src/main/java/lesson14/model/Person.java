package lesson14.model;

import java.util.List;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;
    private Passport passport;
    private List<Property> properties;
    private List<Account> accounts;
    private List<Card> cards;

    public Person() {
    }

    public Person(String lastName, String firstName, String patronymic, Passport passport, List<Property> properties, List<Account> accounts, List<Card> cards) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.passport = passport;
        this.properties = properties;
        this.accounts = accounts;
        this.cards = cards;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Person setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        return this;
    }

    public Person setPassport(Passport passport) {
        this.passport = passport;
        return this;
    }

    public Person setProperties(List<Property> properties) {
        this.properties = properties;
        return this;
    }

    public Person setAccounts(List<Account> accounts) {
        this.accounts = accounts;
        return this;
    }

    public Person setCards(List<Card> cards) {
        this.cards = cards;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Passport getPassport() {
        return passport;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Card> getCards() {
        return cards;
    }
}
