package lesson8.task1;

import java.util.Objects;
import java.util.Random;

public class Person {
    private String name;
    private String surname;

    public Person() {
        Random random = new Random();
        this.name = String.valueOf(random.nextInt(20));
        this.surname = String.valueOf(random.nextInt(20));
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Фамилия: " + surname + " ,Имя: " + name;
    }
}
