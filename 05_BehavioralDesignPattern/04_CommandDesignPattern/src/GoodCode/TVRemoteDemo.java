package GoodCode;

import GoodCode.ConcreateClasses.ChangeChannelCommand;
import GoodCode.ConcreateClasses.ChangeVolumeCommand;
import GoodCode.ConcreateClasses.TurnOffCommand;
import GoodCode.ConcreateClasses.TurnOnCommand;
import GoodCode.CoreClasses.RemoteControl;
import GoodCode.CoreClasses.TV;

public class TVRemoteDemo {
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
