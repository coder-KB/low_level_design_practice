import Controller.Concreate_Games.ChessGame;
import Utility_Classes.Player;

public class ChessGamePlay {
    public static void main(String[] args) {
        // Create Players
        Player player1 = new Player("player1", true);
        Player player2 = new Player("player2", false);

        // Create Chess Games
        ChessGame chessGame = new ChessGame(player1, player2);

        // start the game
        chessGame.startGame();
    }
}
