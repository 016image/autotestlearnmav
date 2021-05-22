package lesson2.task8;

public class DisplayTheCharacterA {
    public static void main(String[] args) {
        System.out.println("С использованием break");
        withBreak(-1);
        withBreak(2);
        withBreak(4);
        withBreak(7);
        withBreak(0);
        System.out.println("Без использования break");
        withoutBreak(-1);
        System.out.println();
        withoutBreak(2);
        System.out.println();
        withoutBreak(4);
        System.out.println();
        withoutBreak(7);
        System.out.println();
        withoutBreak(0);
        System.out.println();
    }

    static void withBreak(int n) {
        switch (n) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("AA");
                break;
            case 3:
                System.out.println("AAA");
                break;
            case 4:
                System.out.println("AAAA");
                break;
            default:
                System.out.println("AAAAA");
        }
    }

    static void withoutBreak(int n) {
        switch (n) {
            default:
                System.out.print("A");
            case 4:
                System.out.print("A");
            case 3:
                System.out.print("A");
            case 2:
                System.out.print("A");
            case 1:
                System.out.print("A");
        }
    }
}