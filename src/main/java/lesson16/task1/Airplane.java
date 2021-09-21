package lesson16.task1;

public class Airplane {

    private int speed = 0;
    private boolean inspected = false;

    private void inspect() {
        System.out.println("Самолет прошел предполетный контроль");
        inspected = true;
    }

    private void fly() {
        if (!inspected) {
            throw new IllegalStateException("Самолет не прошел предполетный контроль");
        }
        if (speed < 300) {
            throw new IllegalStateException("Самолет не может взлететь с данной скоростью");
        }
        System.out.println("Самолет успешно совершил рейс");
        inspected = false;
    }
}
