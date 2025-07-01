package GoodCode.ConcreateClasses;


import GoodCode.Command;
import GoodCode.CoreClasses.TV;

public class TurnOnCommand implements Command {
    private final TV tv;

    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
