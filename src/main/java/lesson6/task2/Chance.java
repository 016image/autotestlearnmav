package lesson6.task2;

import java.util.Random;

public class Chance {
    public static boolean calculateChance(int percent) {
        int random = new Random().nextInt(100);
        return percent >= random;
    }
}
