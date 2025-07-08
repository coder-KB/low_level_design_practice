package Piece_Factory_Classes;

import Piece_Factory_Classes.Concreate_Classes.*;

public class PieceFactory {
    public static Piece createPiece(String type, boolean isWhitePiece) {
        return switch (type) {
            case "king" -> new King(isWhitePiece);
            case "queen" -> new Queen(isWhitePiece);
            case "bishop" -> new Bishop(isWhitePiece);
            case "knight" -> new Knight(isWhitePiece);
            case "rook" -> new Rook(isWhitePiece);
            case "pawn" -> new Pawn(isWhitePiece);
            default -> throw new IllegalArgumentException("Unknown piece type: " + type);
        };
    }
}
