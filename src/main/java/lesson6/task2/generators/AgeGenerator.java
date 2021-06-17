package lesson6.task2.generators;

public class AgeGenerator {
    public static int generate() {
        int age = 20 + (int) (Math.random() * 55);
        return age;
    }
}