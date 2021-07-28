package lesson7.task3.figures;

import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;

import java.util.HashSet;
import java.util.Set;

public class ChessFigure {
    protected Position position;
    protected Player player;
    protected Set<Position> availableMoves = new HashSet<>();


    public ChessFigure(Player player, int x, int y) {
        this.player = player;
        position = new Position(x, y);
    }

    public int getXPosition() {
        return position.getCoordX();
    }

    public int getYPosition() {
        return position.getCoordY();
    }

    public Set<Position> getAvailableMoves() {
        return null;
    }

    ;

    /**
     * Удалить ходы, выходящие за пределы доски у текущей фигуры
     *
     * @return
     */
    protected Set<Position> removeUnavailableMoves() {
        Set<Position> unavailableMoves = new HashSet<>();
        for (Position position : availableMoves) {
            if (position.getCoordX() > 8 || position.getCoordY() > 8 || position.getCoordX() < 1 || position.getCoordY() < 1) {
                unavailableMoves.add(position);
            }
        }
        availableMoves.removeAll(unavailableMoves);
        return availableMoves;
    }

}
