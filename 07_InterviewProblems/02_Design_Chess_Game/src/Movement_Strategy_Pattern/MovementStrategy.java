package Movement_Strategy_Pattern;

import Utility_Classes.Board;
import Utility_Classes.Cell;

public interface MovementStrategy {
    boolean canMove(Board board, Cell start, Cell end);
}
