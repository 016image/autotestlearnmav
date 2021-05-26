package lesson3.task5;

import java.util.Random;

public class Cat {
    String name;
    int year;

    Cat() {
        this.name = Names.RandomNameCats();
        this.year = new Random().nextInt(20);
    }
}
