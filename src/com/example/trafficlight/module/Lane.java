package com.example.trafficlight.module;

import com.example.trafficlight.enums.Direction;
import com.example.trafficlight.interfaces.Sensor;
import com.example.trafficlight.interfaces.Vehicle;

import java.util.ArrayDeque;
import java.util.Queue;

public class Lane {
    private Queue<Vehicle> queue = new ArrayDeque<>();
    private Sensor sensor;
    private Direction direction;

    public Lane(Direction direction) {
        this.direction = direction;
    }

    public int size() {
        return queue.size();
    }
}
