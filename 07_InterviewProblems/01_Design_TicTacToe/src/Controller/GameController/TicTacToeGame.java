package Controller.GameController;

import CommonEnum.GameState;
import CommonEnum.Symbol;
import Controller.BoardGames;
import PlayerStrategies.PlayerStrategy;
import Utility.Board;
import Utility.Player;
import Utility.Position;

public class TicTacToeGame implements BoardGames {
    private final Board board;
    private final Player playerX;
    private final Player playerO;
    private Player currentPlayer;
    private GameState currentState;
    private final int totalMoves;

    public TicTacToeGame(PlayerStrategy xStrategy, PlayerStrategy oStrategy, int rows, int cols) {
        playerX = new Player(Symbol.X, xStrategy);
        playerO = new Player(Symbol.O, oStrategy);
        currentPlayer = playerX;

        currentState = GameState.IN_PROGRESS;

        board = new Board(rows, cols);

        totalMoves = rows * cols;
    }

    @Override
    public void play() {
        int movesCounter = 0;
        do {
            board.printBoard();

            Position move = currentPlayer.getPlayerStrategy().makeMove(board);
            board.makeMove(move, currentPlayer.getSymbol());

            ++movesCounter;

            currentState = board.isWinning(move, currentPlayer.getSymbol());

            switchPlayer();
        } while (currentState == GameState.IN_PROGRESS && movesCounter < totalMoves);

        if (movesCounter == totalMoves) {
            currentState = GameState.DRAW;
        }

        board.printBoard();
        announceResult();
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }

    private void announceResult() {
        System.out.println(currentState);
    }
}
