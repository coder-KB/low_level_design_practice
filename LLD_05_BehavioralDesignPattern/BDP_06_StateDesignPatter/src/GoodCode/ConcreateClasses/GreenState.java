package BDP_06_StateDesignPatter.src.GoodCode.ConcreateClasses;

import BDP_06_StateDesignPatter.src.GoodCode.TrafficLightContext;
import BDP_06_StateDesignPatter.src.GoodCode.TrafficLightState;

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
