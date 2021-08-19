package lesson8.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(50);
        Set<Person> uniquePeople = new HashSet<>();
        Set<Person> personHashSet = new HashSet<>(2000);
        for (int i = 0; i < 50; i++) {
            Person person = new Person();
            personList.add(person);
            if (person.getName().equals(person.getSurname())) {
                uniquePeople.add(person);
            }
        }
        for (Person person : uniquePeople) {
            System.out.println(person);
        }
        for (int i = 0; i < 2000; i++) {
            personHashSet.add(new Person());
        }
        System.out.println("Размер HashSet<Person>: " + personHashSet.size());
    }
}