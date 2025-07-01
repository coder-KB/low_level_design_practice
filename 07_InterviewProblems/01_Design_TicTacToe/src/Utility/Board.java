package Utility;

import CommonEnum.GameState;
import CommonEnum.Symbol;

public class Board {
    int rows;
    int columns;
    Symbol[][] grid;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;

        grid = new Symbol[rows][columns];
        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < columns; ++j) {
                grid[i][j] = Symbol.EMPTY;
            }
        }
    }

    public boolean isValidMove(Position pos) {
        return pos.row >= 0 && pos.row < rows && pos.col >= 0 && pos.col < columns && grid[pos.row][pos.col] == Symbol.EMPTY;
    }

    public void makeMove(Position pos, Symbol symbol) {
        grid[pos.row][pos.col] = symbol;
    }

    public GameState isWinning(Position pos, Symbol currentSymbol) {
        int currRow = pos.row;
        int currCol = pos.col;

        if (isRowWin(currRow, currentSymbol) ||
                isColumnWin(currCol, currentSymbol) ||
                isLeftDiagonalWin(currentSymbol) ||
                isRightDiagonalWin(currentSymbol)
        ) {
            return playerWon(currentSymbol);
        } else {
            return GameState.IN_PROGRESS;
        }
    }

    private GameState playerWon(Symbol currentSymbol) {
        return  currentSymbol == Symbol.X ? GameState.XWON : GameState.OWON;
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Symbol symbol = grid[i][j];
                switch (symbol) {
                    case X:
                        System.out.print(" X ");
                        break;
                    case O:
                        System.out.print(" O ");
                        break;
                    case EMPTY:
                    default:
                        System.out.print(" . ");
                }
                if (j < columns - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < rows - 1) {
                System.out.println("---+---+---");
            }
        }
        System.out.println();
    }

    private boolean isRowWin(int currRow, Symbol currentSymbol) {
        for(int j = 0; j < columns; ++j) {
            if(grid[currRow][j] != currentSymbol) {
                return false;
            }
        }
        return true;
    }

    private boolean isColumnWin(int currCol, Symbol currentSymbol) {
        for(int i = 0; i < rows; ++i) {
            if(grid[i][currCol] != currentSymbol) {
                return false;
            }
        }

        return true;
    }

    private boolean isLeftDiagonalWin(Symbol currentSymbol) {
        for(int i = 0; i < Math.min(rows, columns); ++i) {
            if(grid[i][i] != currentSymbol) {
                return false;
            }
        }
        return true;
    }

    private boolean isRightDiagonalWin(Symbol currentSymbol) {
        for(int i = 0; i < Math.min(rows, columns); ++i) {
            if(grid[i][columns - 1 - i] != currentSymbol) {
                return false;
            }
        }

        return true;
    }

}
