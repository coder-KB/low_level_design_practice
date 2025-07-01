package GoodCode;

import GoodCode.ConcreateClasses.RedState;

public class TrafficLightContext {
    private TrafficLightState currentState;

    public TrafficLightContext() {
        currentState = new RedState();
    }

    public void setCurrentState(TrafficLightState state) {
        this.currentState = state;
    }

    public void next() {
        currentState.next(this);
    }

    public String getColor() {
        return currentState.getColor();
    }
}
