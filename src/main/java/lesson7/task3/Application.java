package lesson7.task3;

import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;
import lesson7.task3.figures.*;

import java.util.ArrayList;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        ArrayList<ChessFigure> figures = new ArrayList<>();

        figures.add(new Pawn(Player.WHITE, 1, 2));
        figures.add(new King(Player.WHITE, 5, 5));
        figures.add(new Rook(Player.BLACK, 2, 4));
        figures.add(new Pawn(Player.WHITE, 8, 2));
        figures.add(new Pawn(Player.BLACK, 8, 7));
        figures.add(new Pawn(Player.WHITE, 5, 8));
        figures.add(new Bishop(Player.BLACK, 1, 1));
        figures.add(new Bishop(Player.WHITE, 7, 6));
        figures.add(new Knight(Player.WHITE, 4, 4));
        figures.add(new Knight(Player.BLACK, 8, 5));
        figures.add(new Queen(Player.WHITE, 1, 3));
        figures.add(new Rook(Player.BLACK, 2, 4));

        for (ChessFigure figure : figures) {
            printMoves(figure);
        }
    }

    private static void printMoves(ChessFigure figure) {
        Set<Position> availableMoves = figure.getAvailableMoves();
        //Выводим имя фигуры
        StringBuilder stringBuilder = new StringBuilder(figure.getClass().getSimpleName());

        //Выводим позицию
        stringBuilder.append('(').append((char) ((figure.getXPosition() - 1) + 'A')).append(':').append(figure.getYPosition()).append("): ");
        //Выводим доступные ходы
        try {
            for (Position position : availableMoves) {
                stringBuilder.append((char) ((position.getCoordX() - 1) + 'A')).append(':').append(position.getCoordY()).append(", ");
            }
        } catch (NullPointerException e) {
            System.out.println(stringBuilder.append("no available moves"));
            return;
        }
        if (stringBuilder.length() != 0) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        System.out.println(stringBuilder);
    }
}
