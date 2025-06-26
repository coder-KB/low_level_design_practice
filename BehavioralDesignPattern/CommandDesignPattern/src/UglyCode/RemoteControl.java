package CommandDesignPattern.src.UglyCode;

public class RemoteControl {
    private final TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public void pressTurnOn() {
        tv.turnOn();
    }

    public void pressTurnOff() {
        tv.turnOff();
    }

    public void pressChangeChannel(int channel) {
        tv.changeChannel(channel);
    }

    public void pressChangeVolume(int volume) {
        tv.changeVolume(volume);
    }

    // New methods are added each time we need more actions
    public void pressOnChangeChannelAndChangeVolume(int channel, int volume) {
        tv.turnOn();;
        tv.changeChannel(channel);
        tv.changeVolume(volume);
    }
}
