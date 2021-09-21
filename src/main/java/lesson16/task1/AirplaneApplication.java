package lesson16.task1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AirplaneApplication {

    public static void main(String[] args) throws Exception {
        Airplane airplane = new Airplane();
        makeAppropriateSpeed(airplane);
        makeInspected(airplane);
        doFlight(airplane);
    }

    private static void makeAppropriateSpeed(Airplane airplane) throws Exception {
        Class clazz = airplane.getClass();
        Field speedField = clazz.getDeclaredField("speed");
        speedField.setAccessible(true);
        speedField.set(airplane, 400);
    }

    private static void makeInspected(Airplane airplane) throws Exception {
        Class clazz = airplane.getClass();
        Method inspectMethod = clazz.getDeclaredMethod("inspect");
        inspectMethod.setAccessible(true);
        inspectMethod.invoke(airplane);
    }

    private static void doFlight(Airplane airplane) throws Exception {
        Class clazz = airplane.getClass();
        Method inspectMethod = clazz.getDeclaredMethod("fly");
        inspectMethod.setAccessible(true);
        inspectMethod.invoke(airplane);
    }
}
