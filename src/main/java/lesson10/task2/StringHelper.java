package lesson10.task2;

import java.util.Random;

public class StringHelper {

    public static String generate() {
        int length = new Random().nextInt(Config.LINES_MAX_LENGTH - Config.LINES_MIN_LENGTH + 1) + Config.LINES_MIN_LENGTH;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(Config.LINES_PATTERN.charAt(new Random().nextInt(Config.LINES_PATTERN.length())));
        }
        String result = builder.toString();
        System.out.printf(Config.LINES_MESSAGE, result);
        return result;
    }
}