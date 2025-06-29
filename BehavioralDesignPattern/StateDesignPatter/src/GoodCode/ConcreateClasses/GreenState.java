package StateDesignPatter.src.GoodCode.ConcreateClasses;

import StateDesignPatter.src.GoodCode.TrafficLightContext;
import StateDesignPatter.src.GoodCode.TrafficLightState;

public class GreenState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from GREEN to YELLOW. Cars slow down!");
        context.setCurrentState(new YellowState());
    }

    @Override
    public String getColor() {
        return "RED";
    }
}
