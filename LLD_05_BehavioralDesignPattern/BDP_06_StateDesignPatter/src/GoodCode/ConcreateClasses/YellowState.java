package BDP_06_StateDesignPatter.src.GoodCode.ConcreateClasses;

import BDP_06_StateDesignPatter.src.GoodCode.TrafficLightContext;
import BDP_06_StateDesignPatter.src.GoodCode.TrafficLightState;

public class YellowState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from YELLOW to RED. Cars stop!");
        context.setCurrentState(new RedState());
    }

    @Override
    public String getColor() {
        return "RED";
    }
}
