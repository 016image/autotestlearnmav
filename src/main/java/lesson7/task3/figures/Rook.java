package lesson7.task3.figures;

import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;

import java.util.Set;

public class Rook extends ChessFigure {

    public Rook(Player player, int x, int y) {
        super(player, x, y);
    }

    @Override
    public Set<Position> getAvailableMoves() {
        for (int i = -8; i < 9; i++) {
            if (i == 0) {
                continue;
            }
            availableMoves.add(new Position(this.position.getCoordX() + i, this.position.getCoordY()));
            availableMoves.add(new Position(this.position.getCoordX(), this.position.getCoordY() + i));
        }
        return this.removeUnavailableMoves();
    }
}
