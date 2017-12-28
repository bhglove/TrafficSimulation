package com.example.trafficlight.module;

import com.example.trafficlight.enums.Direction;
import com.example.trafficlight.enums.TrafficLightState;
import com.example.trafficlight.interfaces.TrafficLight;

public class StraightLight implements TrafficLight {

    private Direction direction;
    private TrafficLightState state = TrafficLightState.RED;
    private boolean blinking = false;

    public StraightLight(Direction direction){
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public boolean isBlinking() {
        return blinking;
    }

    @Override
    public TrafficLightState getState() {
        return state;
    }

    @Override
    public void advanceState() {
        state = this.nextState(state);
    }

    @Override
    public void testLights() {
        blinking = true;
    }

    @Override
    public TrafficLightState[] getStates() {
        return new TrafficLightState[]{TrafficLightState.RED, TrafficLightState.AMBER, TrafficLightState.GREEN};
    }

    private TrafficLightState nextState(TrafficLightState state) {
        TrafficLightState retVal = TrafficLightState.RED;
        TrafficLightState[] states = getStates();

        switch (state.priority()){
            case 4: break;
            case 3: break;
            default: retVal = states[state.priority() + 1];
        }

        return retVal;
    }
}
