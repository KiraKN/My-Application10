package com.kirakn.myapplication10.entity;

public class Car implements Vehicle {
    @Override
    public int getCapacity() {
        return 5;
    }

    @Override
    public int getMaxSpeed() {
        return 210;
    }

    @Override
    public double getWeight() {
        return 1.2;
    }
}
