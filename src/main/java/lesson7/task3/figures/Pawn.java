package lesson7.task3.figures;

import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;

import java.util.HashSet;
import java.util.Set;

public class Pawn extends ChessFigure {

    public Pawn(Player player, int x, int y) {
        super(player, x, y);
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> availableMoves = new HashSet<>();
        if (this.player == Player.WHITE) {
            if (this.position.getCoordY() == 2) {
                availableMoves.add(new Position(this.position.getCoordX(), 3));
                availableMoves.add(new Position(this.position.getCoordX(), 4));
            }
            if (this.position.getCoordY() == 8) {
                return null;
            }
        } else {
            if (this.position.getCoordY() == 7) {
                availableMoves.add(new Position(this.position.getCoordX(), 6));
                availableMoves.add(new Position(this.position.getCoordX(), 5));
            }
            if (this.position.getCoordY() == 1) {
                return null;
            }
        }
        return availableMoves;
    }
}
