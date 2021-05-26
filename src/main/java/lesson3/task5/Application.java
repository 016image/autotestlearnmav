package lesson3.task5;

import java.util.ArrayList;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        ArrayList<Human> peoples = new ArrayList();
        for (int i = 0; i < 10; i++) {
            peoples.add(new Human());
        }
        for (int i = 0; i < peoples.size(); i++) {
            Human firstHuman = peoples.get(i);
            for (int j = i + 1; j < peoples.size(); j++) {
                Human secondHuman = peoples.get(j);
                if (firstHuman.cats.size() == secondHuman.cats.size() && firstHuman.dogs.size() == secondHuman.dogs.size()) {
                    System.out.println(firstHuman.name + " и " + secondHuman.name);
                }
            }
        }
    }
}
