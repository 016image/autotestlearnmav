package lesson5.task3;

public class Application {
    public static void main(String[] args) {
        int exceptionCount = 0;
        final int total = ((int) (500 + Math.random() * 500));

        for (int i = 0; i < total; i++) {
            try {
                int result = ((int) (Math.random() * 5)) / ((int) (Math.random() * 5));
            } catch (ArithmeticException e) {
                exceptionCount++;
            }
        }

        System.out.printf("Из %d операций деления %d было выполнено с ошибкой", total, exceptionCount);
    }
}
