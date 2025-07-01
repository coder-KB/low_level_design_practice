package GoodCode.ConcreateClasses;

import GoodCode.TrafficLightContext;
import GoodCode.TrafficLightState;

public class RedState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from RED to GREEN. Cars go!");
        context.setCurrentState(new GreenState());
    }

    @Override
    public String getColor() {
        return "RED";
    }
}
