package lesson9.task3.figures;

import java.util.Random;

public abstract class TwoParameterFigure extends Figure {
    protected int secondParameter;

    public TwoParameterFigure() {
        firstParameter = new Random().nextInt(10) + 1;
        secondParameter = new Random().nextInt(10) + 1;
    }

    public int getSecondParameter() {
        return secondParameter;
    }
}