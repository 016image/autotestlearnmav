
package lesson9.task3.figures.implementations;

import lesson9.task3.figures.OneParameterFigure;

public class EquilateralTriangle extends OneParameterFigure {
    @Override
    public double getArea() {
        return firstParameter * firstParameter * Math.sqrt(3) / 4;
    }

    @Override
    public double getLength() {
        return firstParameter * 3;
    }
}