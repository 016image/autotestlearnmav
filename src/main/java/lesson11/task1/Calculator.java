package lesson11.task1;

public class Calculator {

    public static int calculateAll(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static int multiplyAll(int... values) {
        int result = 1;
        for (int value : values) {
            result *= value;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateAll(5, 8, 19, 4));
        System.out.println(multiplyAll(5, 8, 19, 4));
    }
}