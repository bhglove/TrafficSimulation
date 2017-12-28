package com.example.trafficlight.interfaces;

import com.example.trafficlight.enums.Direction;
import com.example.trafficlight.enums.TrafficLightState;

public interface TrafficLight {

    /**
     *
     * @return
     */
    boolean isBlinking();

    Direction getDirection();

    TrafficLightState getState();

    /**
     *
     */
    void advanceState();

    /**
     *
     */


    void testLights();

    TrafficLightState[] getStates();

}
