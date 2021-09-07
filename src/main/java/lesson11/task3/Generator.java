package lesson11.task3;

import java.util.Random;

public class Generator {

    public static int randomInteger(int start, int end) {
        int randomPart = new Random().nextInt(end - start + 1);
        return randomPart + start;
    }

    public static String randomString(int startLength, int endLength) {
        String pattern = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
        int length = new Random().nextInt(endLength - startLength + 1) + startLength;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(pattern.charAt(new Random().nextInt(pattern.length())));
        }
        return sb.toString();
    }
}