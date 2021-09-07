package lesson9.task1;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {


        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            cars.add(Factory.make());
        }

        int renaultCount = 0;
        int nissanCount = 0;
        int mitsubishiCount = 0;
        int mercedesCount = 0;
        int regularCount = 0;
        int premiumCount = 0;

        for (Car c : cars) {
            if (c instanceof Renault) renaultCount++;
            if (c instanceof Nissan) nissanCount++;
            if (c instanceof Mitsubishi) mitsubishiCount++;
            if (c instanceof Mercedes) mercedesCount++;
            if (c instanceof Regular) regularCount++;
            if (c instanceof Premium) premiumCount++;

        }
        System.out.printf("Количество Мерседесов %d\n", mercedesCount);
        System.out.printf("Количество Рено %d\n", renaultCount);
        System.out.printf("Количество Митсубиси %d\n", mitsubishiCount);
        System.out.printf("Количество Ниссанов %d\n", nissanCount);
        System.out.printf("Количество Премиум машин %d\n", premiumCount);
        System.out.printf("Количество Обычных машин %d\n", regularCount);
    }
}
