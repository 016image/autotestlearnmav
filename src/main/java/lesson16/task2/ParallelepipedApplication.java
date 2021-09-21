package lesson16.task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.stream.Stream;

public class ParallelepipedApplication {

    public static void main(String[] args) throws Exception {

        Parallelepiped randomParallelepiped = getParallelepiped();

        int height = getParallelepipedAnnotatedDimension(randomParallelepiped, "Высота");
        System.out.println("Высота случайного параллелепипеда = " + height);

        int square = invokeParallelepipedAnnotatedMethod(randomParallelepiped, "Площадь поверхности");
        System.out.println("Площадь поверхности случайного паралелепипеда = " + square);

        int length = getParallelepipedAnnotatedDimension(randomParallelepiped, "Длина");
        int width = getParallelepipedAnnotatedDimension(randomParallelepiped, "Ширина");
        Parallelepiped parametrizedParallelepiped = getParallelepiped(length, width, height);

        int newSquare = invokeParallelepipedAnnotatedMethod(parametrizedParallelepiped, "Площадь поверхности");
        System.out.println("Площадь поверхности нового паралелепипеда = " + newSquare);

        int volume = invokeParallelepipedAnnotatedMethod(parametrizedParallelepiped, "Объем");
        System.out.println("Объем = " + volume);

    }

    private static Parallelepiped getParallelepiped() throws Exception {
        Class<Parallelepiped> clazz = Parallelepiped.class;
        Constructor noParamsConstructor = clazz.getDeclaredConstructor();
        noParamsConstructor.setAccessible(true);
        Object parallelepiped = noParamsConstructor.newInstance();
        return clazz.cast(parallelepiped);
    }

    private static Parallelepiped getParallelepiped(int x, int y, int z) throws Exception {
        Class<Parallelepiped> clazz = Parallelepiped.class;
        Constructor threeParamsConstructor = clazz.getDeclaredConstructor(Integer.TYPE, Integer.TYPE, Integer.TYPE);
        threeParamsConstructor.setAccessible(true);
        Object parallelepiped = threeParamsConstructor.newInstance(x, y, z);
        return clazz.cast(parallelepiped);
    }

    private static int getParallelepipedAnnotatedDimension(Parallelepiped object, String annotationValue)
            throws Exception {
        Field[] allFields = Parallelepiped.class.getDeclaredFields();
        Field field = Stream.of(allFields)
                .filter(f -> f.isAnnotationPresent(Dimension.class))
                .filter(f -> f.getAnnotation(Dimension.class).value().equals(annotationValue))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Не найдена аннотация @Dimension(\"" + annotationValue + "\")"));
        field.setAccessible(true);
        Object result = field.get(object);
        return (Integer) result;
    }

    private static int invokeParallelepipedAnnotatedMethod(Parallelepiped object, String annotationValue, Object... arguments)
            throws Exception {
        Method[] allMethods = Parallelepiped.class.getDeclaredMethods();
        Method method = Stream.of(allMethods)
                .filter(m -> m.isAnnotationPresent(Operation.class))
                .filter(m -> m.getAnnotation(Operation.class).value().equals(annotationValue))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Не найдена аннотация @Operation(\"" + annotationValue + "\")"));
        method.setAccessible(true);
        return (Integer) method.invoke(object, arguments);
    }
}
