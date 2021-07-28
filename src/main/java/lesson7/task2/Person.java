package lesson7.task2;

import lesson6.task1.NameGenerator;

public class Person {
    private String surname;
    private String name;

    public Person() {
        NameGenerator nameGenerator = new NameGenerator();
        this.surname = nameGenerator.generate();
        this.name = nameGenerator.generate();
    }

    @Override
    public String toString() {
        return name + ' ' + surname;
    }
}
