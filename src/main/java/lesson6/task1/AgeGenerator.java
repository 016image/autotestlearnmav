package lesson6.task1;

public class AgeGenerator {
    public static int generate() {
        int age = 20 + (int) (Math.random() * 55);
        return age;
    }
}