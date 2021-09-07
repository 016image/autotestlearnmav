
package lesson9.task3.figures.implementations;

import lesson9.task3.figures.TwoParameterFigure;

public class Ellipse extends TwoParameterFigure {

    @Override
    public double getArea() {
        return Math.PI * firstParameter * secondParameter;
    }

    @Override
    public double getLength() {
        int a = Math.max(firstParameter, secondParameter);
        int b = Math.min(firstParameter, secondParameter);
        return 4d * (Math.PI * a * b + a - b) / (a + b);
    }
}