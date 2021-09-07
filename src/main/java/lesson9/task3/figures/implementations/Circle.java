package lesson9.task3.figures.implementations;

import lesson9.task3.figures.OneParameterFigure;

public class Circle extends OneParameterFigure {

    @Override
    public double getArea() {
        return Math.PI * firstParameter * firstParameter;
    }

    @Override
    public double getLength() {
        return 2d * Math.PI * firstParameter;
    }
}