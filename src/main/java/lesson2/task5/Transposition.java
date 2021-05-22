package lesson2.task5;

import java.util.Arrays;
import java.util.Random;

public class Transposition {
    public static void main(String[] args) {
        int m = new Random().nextInt(3) + 3;
        int n = new Random().nextInt(3) + 3;
        int[][] Array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Array[i][j] = new Random().nextInt(9);
            }
        }
        int[][] Array2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Array2[i][j] = Array[j][i];
            }
        }
        System.out.println("Начальная матрица");
        for (int[] row : Array) {
            for (int element : row)
                System.out.print(element + " ");
            System.out.println();
        }
        System.out.println("Новая матрица");
        for (int[] row : Array2) {
            for (int element : row)
                System.out.print(element + " ");
            System.out.println();
        }
    }
}

