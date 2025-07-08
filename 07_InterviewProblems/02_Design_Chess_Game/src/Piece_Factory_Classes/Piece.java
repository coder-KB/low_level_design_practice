package Piece_Factory_Classes;

import Movement_Strategy_Pattern.MovementStrategy;
import Utility_Classes.Board;
import Utility_Classes.Cell;

public abstract class Piece {
    private boolean isWhitePiece;
    private boolean killed = false;
    private MovementStrategy movementStrategy;

    public Piece(boolean isWhitePiece, MovementStrategy movementStrategy) {
        this.isWhitePiece = isWhitePiece;
        this.movementStrategy = movementStrategy;
    }

    public boolean isWhite() {
        return isWhitePiece;
    }

    public boolean isKilled() {
        return killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public boolean canMove(Board board, Cell startBlock, Cell endBlock) {
        return movementStrategy.canMove(board, startBlock, endBlock);
    }
}
