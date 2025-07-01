package GoodCode.ConcreateClasses;

import GoodCode.Command;
import GoodCode.CoreClasses.TV;

public class TurnOffCommand implements Command {
    private final TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
