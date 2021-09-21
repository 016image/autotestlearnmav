package lesson16.task2;

import java.util.Random;

public class Parallelepiped {

    @Dimension("Длина")
    private int x;

    @Dimension("Ширина")
    private int y;

    @Dimension("Высота")
    private int z;

    private Parallelepiped() {
        this.x = new Random().nextInt(5) + 1;
        this.y = new Random().nextInt(5) + 1;
        this.z = new Random().nextInt(5) + 1;
    }

    private Parallelepiped(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Operation("Площадь поверхности")
    private int getSquare() {
        return 2 * (x * y + x * z + y * z);
    }

    @Operation("Объем")
    private int getVolume() {
        return x * y * z;
    }
}
