package lesson9.task4.distributors;

import lesson9.task4.Cooker;
import lesson9.task4.food.Food;
import java.util.List;

public abstract class Distributor implements CookChooser {

    @Override
    public abstract Cooker chooseCooker(List<Cooker> cookers);

    public void addFood(Food food, List<Cooker> cookers) {
        chooseCooker(cookers).addFood(food);
    }
}