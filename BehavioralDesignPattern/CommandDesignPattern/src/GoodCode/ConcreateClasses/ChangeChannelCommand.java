package CommandDesignPattern.src.GoodCode.ConcreateClasses;

import CommandDesignPattern.src.GoodCode.Command;
import CommandDesignPattern.src.GoodCode.CoreClasses.TV;

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
