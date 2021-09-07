package lesson9.task4;

import lesson9.task4.food.*;
import lesson9.task4.distributors.*;

import java.util.List;
import java.util.Random;


public class Application {
    private static final int AMOUNT_OF_COOKERS = 5 + new Random().nextInt(5);
    private static final int AMOUNT_OF_FOOD = 100;

    public static void main(String[] args) {
        List<Food> order = Generator.foodGenerate(AMOUNT_OF_FOOD);
        List<Cooker> cookers = Generator.cookersGenerate(AMOUNT_OF_COOKERS);

        Distributor busyTimeDistributor = new BusyTimeDistributor();
        Distributor roundRobinDistributor = new RoundRobinDistributor();

        for (Food food : order) {
            busyTimeDistributor.addFood(food, cookers);
        }
        int maxTime = 0;
        for (Cooker cooker : cookers) {
            if (maxTime < cooker.getSummCookingTime())
                maxTime = cooker.getSummCookingTime();
        }
        System.out.println("Суммарное время приготовления блюд поварами по BusyTime: " + maxTime);

        for (Cooker cooker : cookers) {
            cooker.clearOrder();
        }

        for (Food food : order) {
            roundRobinDistributor.addFood(food, cookers);
        }
        maxTime = 0;
        for (Cooker cooker : cookers) {
            if (maxTime < cooker.getSummCookingTime())
                maxTime = cooker.getSummCookingTime();
        }
        System.out.println("Суммарное время приготовления блюд поварами по RoundRobin: " + maxTime);
    }
}