package lesson2.task2;

public class Chess {
    public static void main(String[] args) {
        int[][] array = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                array[i][j] = (i + j) % 2;
        }
        //должен выводить с помощью цикла for
        System.out.println("-For-");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                System.out.print(array[i][j]);
            System.out.println();
        }
        //должен выводить с помощью цикла Foreach
        System.out.println("-Foreach-");
        for (int[] a : array) {
            for (int b : a)
                System.out.print(b);
            System.out.println();
        }
        //должен выводить с помощью цикла While
        System.out.println("-While-");
        int i = 0;
        int j = 0;
        while (i < 8) {
            while (j < 8) {
                System.out.print(array[i][j++]);
            }
            System.out.println();
            i++;
            j = 0;
        }
    }
}
