package lesson6.task2.generators;

public class PhoneGenerator {
    public static String generate() {
        String phone = new StringBuilder()
                .append("+7")
                .append("(")
                .append(threeRandomNumber())
                .append(")")
                .append(threeRandomNumber()).append("-")
                .append(twoRandomNumber()).append("-")
                .append(twoRandomNumber()).toString();
        return phone;
    }

    private static int threeRandomNumber() {
        int randomNumber = 100 + (int) (Math.random() * 899);
        return randomNumber;
    }

    private static int twoRandomNumber() {
        int randomNumber = 10 + (int) (Math.random() * 89);
        return randomNumber;
    }
}