package BDP_04_CommandDesignPattern.src.GoodCode.ConcreateClasses;


import BDP_04_CommandDesignPattern.src.GoodCode.Command;
import BDP_04_CommandDesignPattern.src.GoodCode.CoreClasses.TV;

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
