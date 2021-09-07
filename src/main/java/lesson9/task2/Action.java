package lesson9.task2;

public class Action {

    public static void action(Object item) {
        if (item instanceof Drawable) {
            Drawable drawable = (Drawable) item;
            drawable.draw();
        }
        if (item instanceof Movable) {
            Movable movable = (Movable) item;
            movable.move();
        }
    }
}