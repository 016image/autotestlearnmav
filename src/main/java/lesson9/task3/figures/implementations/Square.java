package lesson9.task3.figures.implementations;

import lesson9.task3.figures.OneParameterFigure;

public class Square extends OneParameterFigure {

    @Override
    public double getArea() {
        return firstParameter * firstParameter;
    }

    @Override
    public double getLength() {
        return 4 * firstParameter;
    }
}