package lesson2.task6;

import java.util.Random;

public class Inversion {
    public static void main(String[] args) {
        int m = new Random().nextInt(6) + 3;
        int n = new Random().nextInt(6) + 3;
        int[][] Array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Array[i][j] = new Random().nextInt(2);
            }
        }
        Array[(1 + new Random().nextInt(Array.length - 2))][(1 + new Random().nextInt(Array[0].length - 2))] = 2;
        int inverse = 0;
        boolean findTwo = false;
        int[][] Array1 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (Array[i][j] == 2) {
                    Array1[i][j] = 2;
                    inverse = 1;
                    findTwo = true;
                    continue;
                } else
                    Array1[i][j] = findTwo
                            ? (Array[i][j] + 1) % 2
                            : Array[i][j];
            }
        }
        System.out.println("Начальная матрица");
        for (int[] row : Array) {
            for (int element : row)
                System.out.print(element + " ");
            System.out.println();
        }
        System.out.println("Инвертированная матрица");
        for (int[] row : Array1) {
            for (int element : row)
                System.out.print(element + " ");
            System.out.println();
        }
    }
}



