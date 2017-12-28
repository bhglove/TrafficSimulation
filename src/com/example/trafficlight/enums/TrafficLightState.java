package com.example.trafficlight.enums;

import com.example.trafficlight.interfaces.TrafficLight;

/**
 * Created by Benjamin on 12/27/17.
 */
public enum TrafficLightState {
    RED , AMBER, TURN, GREEN;

    public int priority(){
        int retVal = 0;

        switch(this) {
            case RED:
                break;
            case AMBER:
                retVal = 1;
                break;
            case TURN:
                retVal = 2;
                break;
            case GREEN:
                retVal = 3;
                break;
        }
        return retVal;
    }
}
