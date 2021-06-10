package lesson5.task1;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int m = new Random().nextInt(5) + 5;
        int n = new Random().nextInt(5) + 5;

        int[] dividends = new int[m];
        int[] dividers = new int[n];
        int[][] result = new int[n][m];

        for (int i = 0; i < m; i++) {
            dividends[i] = new Random().nextInt(5) + 4;
        }
        for (int i = 0; i < n; i++) {
            dividers[i] = new Random().nextInt(3);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    result[j][i] = dividends[i] / dividers[j];
                } catch (ArithmeticException exception) {
                    result[j][i] = -1;
                }
            }
        }

        System.out.println("Массив dividends:");
        for (int dividend : dividends) System.out.print(dividend + " ");
        System.out.println();
        System.out.println("Массив dividers:");
        for (int divider : dividers) System.out.print(divider + " ");
        System.out.println();
        System.out.println("Результат:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[j][i] + " ");
            }
            System.out.println();
        }
    }
}

