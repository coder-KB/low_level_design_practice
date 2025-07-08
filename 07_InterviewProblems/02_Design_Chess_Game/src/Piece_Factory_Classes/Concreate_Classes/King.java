package Piece_Factory_Classes.Concreate_Classes;

import Movement_Strategy_Pattern.Concreate_Classes.KingMovementStrategy;
import Piece_Factory_Classes.Piece;
import Utility_Classes.Board;
import Utility_Classes.Cell;

public class King extends Piece {
    public King(boolean isWhitePiece) {
        super(isWhitePiece, new KingMovementStrategy());
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        return super.canMove(board, start, end);
    }
}
