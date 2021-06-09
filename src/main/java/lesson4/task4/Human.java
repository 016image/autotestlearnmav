package lesson4.task4;

public class Human {
    private String lastName;
    private String firstName;
    private int age;
    private Passport passport;

    public Human() {
    }

    public Human setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Human setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public Human setPassport(Passport passport) {
        if (passport == null) {
            return this;
        }
        String getSeries = passport.getSeries();
        String getNumber = passport.getNumber();
        if (getSeries != null && getNumber != null) {
            this.passport = passport;
            System.out.printf("Выдан паспорт на имя %s %s, серия %s и номер %s%n", firstName, lastName, passport.getSeries(), passport.getNumber());
        } else {
            System.out.printf("Отказ в выдаче паспорта с сериеей %s и номером %s%n", passport.getSeries(), passport.getNumber());
        }
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Passport getPassport() {
        return passport;
    }
}