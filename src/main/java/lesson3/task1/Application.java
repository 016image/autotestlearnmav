package lesson3.task1;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Сложение");
        System.out.println(calculator.summ(4, 2));
        System.out.println("Вычитание");
        System.out.println(calculator.substract(5, 3));
        System.out.println("Умножение");
        System.out.println(calculator.multiply(2, 6));
        System.out.println("Деление");
        System.out.println(calculator.divide(5, 3));
    }
}
