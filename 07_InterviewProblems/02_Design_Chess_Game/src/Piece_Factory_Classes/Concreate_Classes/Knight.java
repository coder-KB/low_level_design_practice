package Piece_Factory_Classes.Concreate_Classes;

import Movement_Strategy_Pattern.Concreate_Classes.KnightMovementStrategy;
import Piece_Factory_Classes.Piece;
import Utility_Classes.Board;
import Utility_Classes.Cell;

public class Knight extends Piece {
    public Knight(boolean isWhitePiece) {
        super(isWhitePiece, new KnightMovementStrategy());
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        return super.canMove(board, start, end);
    }
}
