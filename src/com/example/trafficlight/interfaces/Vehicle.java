package com.example.trafficlight.interfaces;

import com.example.trafficlight.enums.Direction;

public interface Vehicle {

  public Direction getDirection();
  public void setDirection(Direction direction);

  public void move();
}
