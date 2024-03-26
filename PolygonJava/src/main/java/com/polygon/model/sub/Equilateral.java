package com.polygon.model.sub;

import com.polygon.model.base.Triangle;

public class Equilateral extends Triangle {
    public Equilateral(double sideLength) {
        super(sideLength, sideLength, sideLength);
    }

    @Override
    public double getHeight() {
        return Math.sqrt(Math.pow(getSideA(), 2) -
                Math.pow(getSideB() / 2, 2));
    }

    @Override
    public String toString() {
        return "Equilateral Triangle";
    }
}
