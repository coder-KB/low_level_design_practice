package StateDesignPatter.src.GoodCode.ConcreateClasses;

import StateDesignPatter.src.GoodCode.TrafficLightContext;
import StateDesignPatter.src.GoodCode.TrafficLightState;

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
