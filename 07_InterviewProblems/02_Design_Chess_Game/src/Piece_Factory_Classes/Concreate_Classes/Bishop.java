package Piece_Factory_Classes.Concreate_Classes;

import Movement_Strategy_Pattern.Concreate_Classes.BishopMovementStrategy;
import Piece_Factory_Classes.Piece;
import Utility_Classes.Board;
import Utility_Classes.Cell;

public class Bishop extends Piece {
    public Bishop(boolean isWhitePiece) {
        super(isWhitePiece, new BishopMovementStrategy());
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        return super.canMove(board, start, end);
    }
}
