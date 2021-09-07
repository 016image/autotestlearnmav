package lesson9.task1;

import java.util.Random;

public class Factory {

    public static Car make() {
        int random = new Random().nextInt(101);
        if (random < 40)
            return new Renault();
        else if (random < 70)
            return new Nissan();
        else if (random < 90)
            return new Mitsubishi();
        else if (random >= 90)
            return new Mercedes();
        throw new IllegalStateException();
    }
}