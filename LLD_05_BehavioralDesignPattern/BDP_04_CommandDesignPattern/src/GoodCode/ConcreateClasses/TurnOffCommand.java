package BDP_04_CommandDesignPattern.src.GoodCode.ConcreateClasses;

import BDP_04_CommandDesignPattern.src.GoodCode.Command;
import BDP_04_CommandDesignPattern.src.GoodCode.CoreClasses.TV;

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
