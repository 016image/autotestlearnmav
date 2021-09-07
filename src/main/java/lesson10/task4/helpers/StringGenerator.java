package lesson10.task4.helpers;

import java.util.Random;

public class StringGenerator {

    public static String generate(int length, String pattern) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(pattern.charAt(new Random().nextInt(pattern.length())));
        }
        return sb.toString();
    }
}