package lesson9.task3;

import lesson9.task3.figures.Figure;
import lesson9.task3.figures.implementations.*;

public class Generator {
    private static int around = 0;

    public static Figure generate() {
        around %= 6;
        switch (around++) {
            case 0:
                return new Circle();
            case 1:
                return new Ellipse();
            case 2:
                return new EquilateralTriangle();
            case 3:
                return new Rectangle();
            case 4:
                return new RightTriangle();
            case 5:
                return new Square();
        }
        return null;
    }
}