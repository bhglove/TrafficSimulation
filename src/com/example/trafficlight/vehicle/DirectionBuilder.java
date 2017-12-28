package com.example.trafficlight.vehicle;

import com.example.trafficlight.enums.Direction;

import java.util.Random;

/**
 * Created by Benjamin on 12/28/17.
 */
public class DirectionBuilder {
    private Directions directions;

    public DirectionBuilder(int size) {
        directions = randomDirections(size);
    }


    public Directions getDirections() {
        return this.directions;
    }

    private Directions randomDirections(int size) {
        Directions directions = new Directions();
        Direction[] values = Direction.values();

        for (int i = 0; i < size; i++) {
            Random random = new Random();
            directions.addDirection(values[random.nextInt(4)]);
        }

        return directions;
    }
}

