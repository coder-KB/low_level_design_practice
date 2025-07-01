import Controller.GameController.TicTacToeGame;
import PlayerStrategies.ConcreateStrategies.HumanStrategy;
import PlayerStrategies.PlayerStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");

        PlayerStrategy playerXStrategy = new HumanStrategy("Player X");
        PlayerStrategy playerOStrategy = new HumanStrategy("Player O");

        TicTacToeGame game = new TicTacToeGame(playerXStrategy, playerOStrategy, 3, 3);
        game.play();
    }
}