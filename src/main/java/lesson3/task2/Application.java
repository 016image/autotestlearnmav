package lesson3.task2;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat(2, 5, "Барсик");
        cats[1] = new Cat(3, 11, "Мурзик");
        cats[2] = new Cat(7, 2, "Матильда");
        cats[3] = new Cat(1, 3, "Леопольд");
        cats[4] = new Cat(11, 4, "Базилио");

        String[] names = new String[cats.length];
        for (int i = 0; i < cats.length; i++) {
            names[i] = cats[i].name;
        }
        Arrays.sort(names);
        for (String name : names) {
            for (Cat cat : cats) {
                if (cat.name.contains(name)) {
                    System.out.printf("Имя: %s, Возраст: %d, Вес: %d%n", cat.name, cat.age, cat.weight);
                    break;
                }
            }
        }
    }
}
