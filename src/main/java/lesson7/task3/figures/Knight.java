package lesson7.task3.figures;

import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;

import java.util.Set;

public class Knight extends ChessFigure {

    public Knight(Player player, int x, int y) {
        super(player, x, y);
    }

    @Override
    public Set<Position> getAvailableMoves() {
        for (int i = -2; i < 3; i++) {
            for (int j = -2; j < 3; j++) {
                if (Math.abs(i) != Math.abs(j) && i != 0 && j != 0) {
                    availableMoves.add(new Position(this.position.getCoordX() + i, this.position.getCoordY() + j));
                }
            }
        }
        return this.removeUnavailableMoves();
    }
}
