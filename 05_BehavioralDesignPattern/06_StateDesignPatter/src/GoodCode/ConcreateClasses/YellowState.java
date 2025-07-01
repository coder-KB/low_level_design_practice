package GoodCode.ConcreateClasses;

import GoodCode.TrafficLightContext;
import GoodCode.TrafficLightState;

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
