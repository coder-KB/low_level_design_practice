package BDP_06_StateDesignPatter.src.GoodCode;

public interface TrafficLightState {
    void next(TrafficLightContext trafficLightContext);
    String getColor();
}
