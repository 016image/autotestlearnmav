package lesson3.task5;

import java.util.Random;

public class Dog {
    String name;
    int year;

    Dog() {
        this.name = Names.RandomNameDogs();
        this.year = new Random().nextInt(20);
    }
}
