package GoodCode.ConcreateClasses;

import GoodCode.Command;
import GoodCode.CoreClasses.TV;

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
