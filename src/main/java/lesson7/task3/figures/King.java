package lesson7.task3.figures;


import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;

import java.util.Set;

public class King extends ChessFigure {

    public King(Player player, int x, int y) {
        super(player, x, y);
    }

    @Override
    public Set<Position> getAvailableMoves() {
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                availableMoves.add(new Position(this.position.getCoordX() + i, this.position.getCoordY() + j));
            }
        }
        return this.removeUnavailableMoves();
    }
}
