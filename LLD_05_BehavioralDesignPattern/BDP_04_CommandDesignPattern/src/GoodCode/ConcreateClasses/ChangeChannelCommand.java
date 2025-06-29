package BDP_04_CommandDesignPattern.src.GoodCode.ConcreateClasses;

import BDP_04_CommandDesignPattern.src.GoodCode.Command;
import BDP_04_CommandDesignPattern.src.GoodCode.CoreClasses.TV;

public class ChangeChannelCommand implements Command {
    private final TV tv;
    private final int channel;

    public ChangeChannelCommand(TV tv, int channel) {
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    public void execute() {
        tv.changeChannel(channel);
    }
}
