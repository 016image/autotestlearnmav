package lesson9.task4;

import lesson9.task4.food.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    public static List<Food> foodGenerate(int amountOfFood){
        List<Food> foods = new ArrayList<>();
        for (int i = 0; i < amountOfFood; i++) {
            foods.add(randomFood());
        }
        return foods;
    }

    public static List<Cooker> cookersGenerate(int amount){
        List<Cooker> cookers = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            cookers.add(new Cooker());
        }
        return cookers;
    }

    private static Food randomFood() {
        int random = new Random().nextInt(101);
        if (random < 16)
            return new Coffee();
        else if (random < 32)
            return new Fish();
        else if (random < 48)
            return new Meat();
        else if (random < 64)
            return new Rice();
        else if (random < 80)
            return new Tea();
        else if (random < 101)
            return new Buckwheat();
        throw new IllegalStateException();
    }
}