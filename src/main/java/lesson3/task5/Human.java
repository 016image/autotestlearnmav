package lesson3.task5;

import java.util.ArrayList;
import java.util.Random;

public class Human {
    String name;
    ArrayList<Cat> cats = new ArrayList();
    ArrayList<Dog> dogs = new ArrayList();

    Human() {
        this.name = Names.RandomNamePeople();
        int randomNumber = new Random().nextInt(4);
        for (int i = 0; i < randomNumber; i++) {
            dogs.add(new Dog());
            i++;
        }
        int randomNumber1 = new Random().nextInt(4);
        for (int i = 0; i < randomNumber1; i++) {
            cats.add(new Cat());
        }
    }
}
