package lesson7.task1;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Integer> list = new MyArrayList<>();

        list.add(1);
        list.add(9);
        list.add(1, 6);
        list.add(0);
        list.contains(9);
        list.contains(45);
        list.size();
        list.get(-2);
    }
}
