package lesson10.task4.helpers;

public class DoubleHelper {

    public static Double round(Double toRound) {
        toRound *= 100;
        toRound = 1d * Math.round(toRound) / 100;
        return toRound;
    }
}