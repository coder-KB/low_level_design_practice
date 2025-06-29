package StateDesignPatter.src.GoodCode.ConcreateClasses;

import StateDesignPatter.src.GoodCode.TrafficLightContext;
import StateDesignPatter.src.GoodCode.TrafficLightState;

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
