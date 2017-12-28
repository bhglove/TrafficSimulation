package com.example.trafficlight.vehicle;

import com.example.trafficlight.enums.Direction;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

/**
 * Created by Benjamin on 12/28/17.
 */
public class Directions {
    private Queue<Direction> directions = new ArrayDeque<>();

    public Directions() {

    }

    public Directions(Direction[] directions) {
        Collections.addAll(this.directions, directions);
    }

    public void addDirection(Direction direction) {
        this.directions.add(direction);
    }

    public Direction nextDirection() {
        return this.directions.remove();
    }

    public boolean isEmpty() {
        return directions.isEmpty();
    }

}
