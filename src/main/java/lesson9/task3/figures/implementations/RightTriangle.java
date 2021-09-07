
package lesson9.task3.figures.implementations;

import lesson9.task3.figures.TwoParameterFigure;

public class RightTriangle extends TwoParameterFigure {

    @Override
    public double getArea() {
        return (firstParameter * secondParameter) / 2;
    }

    @Override
    public double getLength() {
        return firstParameter + secondParameter + getHypotenuse();
    }

    public double getHypotenuse() {
        return Math.sqrt(firstParameter * firstParameter + secondParameter * secondParameter);
    }
}