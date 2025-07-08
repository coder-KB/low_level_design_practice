package Utility_Classes;

import Piece_Factory_Classes.PieceFactory;

public class Board {
    private static Board boardInstance;
    private Cell[][] board;

    // Private Constructor to make it Singleton
    private Board(int rows) {
        initializeBoard(rows);
    }

    public static Board getInstance(int rows) {
        if(boardInstance == null) {
            boardInstance = new Board(rows);
        }

        return boardInstance;
    }

    private void initializeBoard(int rows) {
        board = new Cell[rows][rows];

        // Set White pieces first
        setPieceRow(0, true);
        setPawnRow(1, rows, true);

        // Set Black Pieces now
        setPieceRow(rows - 1, false);
        setPawnRow(rows - 2, rows, false);

        // Set other places as empty cell
        for(int row = 2; row < rows - 2; ++row) {
            for(int col = 0; col < rows; ++col) {
                board[row][col] = new Cell(row, col, null);
            }
        }
    }

    // Set the major pieces
    private void setPieceRow(int row, boolean isWhite) {
        board[row][0] = new Cell(row, 0, PieceFactory.createPiece("rook", isWhite));
        board[row][1] = new Cell(row, 1, PieceFactory.createPiece("knight", isWhite));
        board[row][2] = new Cell(row, 2, PieceFactory.createPiece("bishop", isWhite));
        board[row][3] = new Cell(row, 3, PieceFactory.createPiece("queen", isWhite));
        board[row][4] = new Cell(row, 4, PieceFactory.createPiece("king", isWhite));
        board[row][5] = new Cell(row, 5, PieceFactory.createPiece("bishop", isWhite));
        board[row][6] = new Cell(row, 6, PieceFactory.createPiece("knight", isWhite));
        board[row][7] = new Cell(row, 7, PieceFactory.createPiece("rook", isWhite));
    }

    // Set the pawn row
    private void setPawnRow(int row, int rows, boolean isWhilte) {
        for(int col = 0; col < rows; ++col) {
            board[row][col] = new Cell(row, col, PieceFactory.createPiece("pawn", isWhilte));
        }
    }

    public Cell getCell(int row, int col) {
        if(row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return board[row][col];
        }
        return null;
    }
}
