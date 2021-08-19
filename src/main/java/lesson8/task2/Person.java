package lesson8.task2;

import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

public class Person implements Comparator, Comparable {
    private int birthDate;

    public Person() {
        this.birthDate = new Random().nextInt(365) + 1;
    }

    @Override
    public String toString() {
        return "BirthDate= " + birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthDate == person.birthDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthDate);
    }

    @Override
    public int compare(Object o1, Object o2) {
        Person person1 = (Person) o1;
        Person person2 = (Person) o2;
        return Integer.compare(person1.birthDate, person2.birthDate);
    }

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        return Integer.compare(this.birthDate, person.birthDate);
    }
}
