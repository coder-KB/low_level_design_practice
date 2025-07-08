package Movement_Strategy_Pattern.Concreate_Classes;

import Movement_Strategy_Pattern.MovementStrategy;
import Utility_Classes.Board;
import Utility_Classes.Cell;

public class KnightMovementStrategy implements MovementStrategy {
    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        return true;
    }
}
