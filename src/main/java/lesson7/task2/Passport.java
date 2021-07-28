package lesson7.task2;

import java.util.Random;

public class Passport {
    private static final String DIGITS = "0123456789";
    private String series;
    private String number;

    public Passport() {
        this.series = generateNumber(4);
        this.number = generateNumber(6);
    }

    private String generateNumber(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(DIGITS.charAt(new Random().nextInt(DIGITS.length())));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return series + ' ' + number;
    }
}
