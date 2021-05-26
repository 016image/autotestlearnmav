package lesson3.task3;

import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        //бабушки,дедушки
        Human valeriy = new Human("Валерий", 58, null, null);
        Human alexandra = new Human("Александра", 57, null, null);
        Human ivan = new Human("Иван", 64, null, null);
        //родители
        Human sergey = new Human("Сергей", 40, valeriy, alexandra);
        Human marina = new Human("Марина", 38, ivan, null);
        //дети
        Human vitaliy = new Human("Виталий", 18, sergey, marina);
        Human elena = new Human("Елена", 16, sergey, marina);

        Human[] parentGrandFather = getGrandParents(elena.getFather());
        Human[] parentGrandMather = getGrandParents(elena.getMather());

        int fal = parentGrandFather.length;
        int sal = parentGrandMather.length;

        Human[] result = new Human[fal + sal];
        System.arraycopy(parentGrandFather, 0, result, 0, fal);
        System.arraycopy(parentGrandMather, 0, result, fal, sal);

        for (Human human : result) {
            if (human != null) {
                System.out.println(human);
            }
        }
    }

    private static Human[] getGrandParents(Human human) {
        Human grandFather = human.getFather();
        Human grandMather = human.getMather();
        return new Human[]{
                grandMather, grandFather
        };
    }
}

