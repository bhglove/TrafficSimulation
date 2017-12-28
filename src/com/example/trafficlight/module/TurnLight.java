package com.example.trafficlight.module;

import com.example.trafficlight.enums.Direction;
import com.example.trafficlight.enums.TrafficLightState;
import com.example.trafficlight.interfaces.TrafficLight;

class TurnLight implements TrafficLight {
    private Direction direction;
    private Direction turnLane;
    private TrafficLightState state = TrafficLightState.RED;
    private boolean blinking = false;

    public TurnLight(Direction direction){
        this.direction = direction;
        this.turnLane = this.getTurnLane();
    }

    public Direction getDirection() {
        return direction;
    }

    private Direction getTurnLane() {
        switch (this.getDirection()){
            case NORTH:
                this.turnLane = Direction.WEST;
                break;
            case EAST:
                this.turnLane = Direction.NORTH;
                break;
            case WEST:
                this.turnLane = Direction.SOUTH;
                break;
            case SOUTH:
                this.turnLane = Direction.EAST;
                break;
        }
        return this.turnLane;
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

    private TrafficLightState nextState(TrafficLightState state) {
        TrafficLightState retVal = TrafficLightState.RED;
        TrafficLightState[] states = getStates();

        switch (state.priority()){
            case 3: break;
            default: retVal = states[state.priority() + 1];
        }

        return retVal;
    }

    @Override
    public TrafficLightState[] getStates() {
        return TrafficLightState.values();
    }
}
