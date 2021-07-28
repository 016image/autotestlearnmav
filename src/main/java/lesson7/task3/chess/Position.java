package lesson7.task3.chess;

public class Position {
    private int coordX;
    private int coordY;

    public Position(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    @Override
    public boolean equals(Object obj) {
        Position position = (Position) obj;
        return (coordX == position.getCoordX() && coordY == position.getCoordY());
    }

    @Override
    public int hashCode() {
        return this.coordY + this.coordX;
    }
}
