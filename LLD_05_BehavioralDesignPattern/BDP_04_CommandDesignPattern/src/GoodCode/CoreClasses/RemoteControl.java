package BDP_04_CommandDesignPattern.src.GoodCode.CoreClasses;

import BDP_04_CommandDesignPattern.src.GoodCode.Command;

public class RemoteControl {
    private Command onCommand;
    private Command offCommand;

    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }

    public void pressOnButton() {
        onCommand.execute();
    }

    public void pressOffButton() {
        offCommand.execute();;
    }
}
