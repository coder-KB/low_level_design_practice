package CommandDesignPattern.src.GoodCode;

import CommandDesignPattern.src.GoodCode.ConcreateClasses.ChangeChannelCommand;
import CommandDesignPattern.src.GoodCode.ConcreateClasses.ChangeVolumeCommand;
import CommandDesignPattern.src.GoodCode.ConcreateClasses.TurnOffCommand;
import CommandDesignPattern.src.GoodCode.ConcreateClasses.TurnOnCommand;
import CommandDesignPattern.src.GoodCode.CoreClasses.RemoteControl;
import CommandDesignPattern.src.GoodCode.CoreClasses.TV;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();

        // Create commands
        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command changeChannel = new ChangeChannelCommand(tv, 5);
        Command changeVolume = new ChangeVolumeCommand(tv, 100);

        // Create Remote Control
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(turnOn);
        remoteControl.setOffCommand(turnOff);

        remoteControl.pressOnButton(); // Turned on the tv

        changeChannel.execute(); // Change channel

        changeVolume.execute(); // Change volume

        remoteControl.pressOffButton(); // Turned off the tv
    }
}
