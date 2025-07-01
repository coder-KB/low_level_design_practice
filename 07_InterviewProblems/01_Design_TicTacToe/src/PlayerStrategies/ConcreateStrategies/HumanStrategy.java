package PlayerStrategies.ConcreateStrategies;

import PlayerStrategies.PlayerStrategy;
import Utility.Board;
import Utility.Position;

import java.util.Scanner;

public class HumanStrategy implements PlayerStrategy {
    private final Scanner scanner;
    private final String playerName;

    public HumanStrategy(String playerName) {
        this.playerName = playerName;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Position makeMove(Board board) {
        while (true) {
            System.out.println(playerName + ", enter your move (row[0-2] and column[0-2]): ");
            try {
                int row = scanner.nextInt();
                int col = scanner.nextInt();

                Position move = new Position(row, col);
                if(board.isValidMove(move)) {
                    return move;
                }

                System.out.println("Invalid Move, Try Again");
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter row and column as numbers.");
                scanner.nextLine(); // Clear input buffer
            }
        }
    }
}
