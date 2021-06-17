package lesson6.task1;

import java.util.Random;

public class NameGenerator {
    public static String generate() {
        int length = 5 + (int) (Math.random() * 8);
        StringBuilder name = new StringBuilder().append(titleRandomChar());
        for (int i = 0; i < length; i++)
            name.append(lowercaseRandomChar());
        return name.toString();
    }

    private static char titleRandomChar() {
        Random r = new Random();
        int c = r.nextInt(33) + 'А';
        return (char) c;
    }

    private static char lowercaseRandomChar() {
        Random r = new Random();
        int c = r.nextInt(34) + 'а';
        return (char) c;
    }
}

