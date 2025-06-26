package CommandDesignPattern.src.GoodCode.ConcreateClasses;

import CommandDesignPattern.src.GoodCode.Command;
import CommandDesignPattern.src.GoodCode.CoreClasses.TV;

public class ChangeVolumeCommand implements Command {
    private final TV tv;
    private final int volume;

    public ChangeVolumeCommand(TV tv, int volume) {
        this.tv = tv;
        this.volume = volume;
    }

    @Override
    public void execute() {
        tv.changeVolume(volume);
    }
}
