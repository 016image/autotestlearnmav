package lesson7.task2;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        ThreeHashMap<Integer, Person, Passport> people = new ThreeHashMap<>();
        Map<Integer, Person> persons = new HashMap<>(20);
        Map<Integer, Passport> passports = new HashMap<>(20);

        for (int i = 0; i < 10; i++) {
            people.put(i, new Person(), new Passport());
        }
        for (int i = 0; i < 20; i++) {
            persons.put(10 + i, new Person());
            passports.put(20 + i, new Passport());
        }
        people.putAll(persons, passports);
        people.printAll();
    }
}
