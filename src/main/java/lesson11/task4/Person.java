package lesson11.task4;

import java.util.Date;
import java.util.Objects;

public class Person {
    private final String lastName;
    private final String firstName;
    private final String patronymic;
    private final Date birthDate;
    private final Passport passport;

    public Person(String lastName, String firstName, String patronymic, Date birthDate, Passport passport) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.passport = passport;
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

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!Objects.equals(lastName, person.lastName)) return false;
        if (!Objects.equals(firstName, person.firstName)) return false;
        if (!Objects.equals(patronymic, person.patronymic)) return false;
        if (!Objects.equals(birthDate, person.birthDate)) return false;
        return Objects.equals(passport, person.passport);
    }

    @Override
    public int hashCode() {
        int result = lastName != null ? lastName.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (passport != null ? passport.hashCode() : 0);
        return result;
    }
}