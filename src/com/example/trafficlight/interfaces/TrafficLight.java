package com.example.trafficlight.interfaces;

import com.example.trafficlight.enums.Direction;
import com.example.trafficlight.enums.TrafficLightState;

public interface TrafficLight {

    /**
     *
     * @return
     */
    public boolean isBlinking();

    public Direction getDirection();

    public TrafficLightState getState();

    /**
     *
     */
    public void advanceState();

    /**
     *
     */



    public void testLights();

    public TrafficLightState[] getStates();

}
