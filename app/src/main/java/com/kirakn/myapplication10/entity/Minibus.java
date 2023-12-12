package com.kirakn.myapplication10.entity;

public class Minibus implements Vehicle {
    @Override
    public int getCapacity() {
        return 8;
    }

    @Override
    public int getMaxSpeed() {
        return 180;
    }

    @Override
    public double getWeight() {
        return 1.6;
    }
}