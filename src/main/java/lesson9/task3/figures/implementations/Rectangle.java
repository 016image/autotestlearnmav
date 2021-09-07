
package lesson9.task3.figures.implementations;

import lesson9.task3.figures.TwoParameterFigure;

public class Rectangle extends TwoParameterFigure {

    @Override
    public double getArea() {
        return firstParameter * secondParameter;
    }

    @Override
    public double getLength() {
        return 2 * (firstParameter + secondParameter);
    }
}