package Piece_Factory_Classes.Concreate_Classes;

import Movement_Strategy_Pattern.Concreate_Classes.PawnMovementStrategy;
import Piece_Factory_Classes.Piece;
import Utility_Classes.Board;
import Utility_Classes.Cell;

public class Pawn extends Piece {
    public Pawn(boolean isWhitePiece) {
        super(isWhitePiece, new PawnMovementStrategy());
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        return super.canMove(board, start, end);
    }
}
