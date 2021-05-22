package lesson1;

import lesson1.task1.Circle;
import lesson1.task2.Rectangle;
import lesson1.task3.OddOrEven;
import lesson1.task4.Meters;
import lesson1.task5.LogicalOperations;
import lesson1.task6.Scheme;

public class Main {
    public static void main(String[] args) {
        //Возвращаем площадь окружности
        Circle circle = new Circle();
        System.out.println("--Task1--");
        System.out.println(circle.calculateArea(0));
        System.out.println(circle.calculateArea(2));
        System.out.println(circle.calculateArea(100));
        //Возвращаем логическую переменную, которая принимает значение true, если площадь прямоугольника больше, чем его периметр. В противном случае метод должен возвращать false.
        Rectangle rectangle1 = new Rectangle(2, 7);
        Rectangle rectangle2 = new Rectangle(6, 5);
        Rectangle rectangle3 = new Rectangle(6, 3);
        System.out.println("--Task2--");
        System.out.println(rectangle1.perimeterMoreArea());
        System.out.println(rectangle2.perimeterMoreArea());
        System.out.println(rectangle3.perimeterMoreArea());
        //Возвращаем true, если N – нечетное число и false, если число N – четное.
        OddOrEven oddoreven = new OddOrEven();
        System.out.println("--Task3--");
        System.out.println(oddoreven.calculateNumber(14));
        System.out.println(oddoreven.calculateNumber(19));
        //Возвращаем целое число, равное количеству метров.
        Meters meters = new Meters();
        System.out.println("--Task4--");
        System.out.println(meters.calculateMeter(115));
        System.out.println(meters.calculateMeter(800));
        System.out.println(meters.calculateMeter(278));
        //Возвращаем противоположный результат выполнения операции a or b.
        LogicalOperations logicalOperations = new LogicalOperations();
        System.out.println("--Task5--");
        System.out.println("Первый метод");
        System.out.println(logicalOperations.aOrB(false, false));
        System.out.println(logicalOperations.aOrB(false, true));
        System.out.println(logicalOperations.aOrB(true, false));
        System.out.println(logicalOperations.aOrB(true, true));
        System.out.println("Второй метод");
        System.out.println(logicalOperations.aAndB(false, false));
        System.out.println(logicalOperations.aAndB(false, true));
        System.out.println(logicalOperations.aAndB(true, false));
        System.out.println(logicalOperations.aAndB(true, true));
        //Возвращаем логическую переменную, являющуюся результатом выполнения схемы.
        Scheme scheme = new Scheme();
        System.out.println("--Task6--");
        System.out.println(scheme.methodScheme(false, false, false, false));
        System.out.println(scheme.methodScheme(true, true, true, true));
        System.out.println(scheme.methodScheme(false, true, false, true));
        System.out.println(scheme.methodScheme(true, false, true, false));
        System.out.println(scheme.methodScheme(true, true, false, false));
    }
}