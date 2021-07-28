package lesson7.task3.figures;

import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;

import java.util.Set;

public class Bishop extends ChessFigure {

    public Bishop(Player player, int x, int y) {
        super(player, x, y);
    }

    @Override
    public Set<Position> getAvailableMoves() {
        for (int i = -9; i < 9; i++) {
            for (int j = -9; j < 9; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (Math.abs(i) == Math.abs(j)) {
                    this.availableMoves.add(new Position(this.position.getCoordX() + i, this.position.getCoordY() + j));
                }
            }
        }
        return this.removeUnavailableMoves();
    }
}
