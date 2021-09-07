package lesson9.task2;

public class Generator {
    static int pointer = 0;

    public static Object generate() {
        switch (pointer) {
            case 0:
                pointer++;
                return new Square();
            case 1:
                pointer++;
                return new Circle();
            case 2:
                pointer++;
                return new Box();
            case 3:
                pointer = 0;
                return new Table();
        }
        return null;
    }
}