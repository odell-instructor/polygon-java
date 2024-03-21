package com.polygon.model.sub;

import com.polygon.model.base.Polygon;

public class Pentagon extends Polygon {

    private final double equalSides;

    public Pentagon(double equalSides) {
        super(5);
        this.equalSides = equalSides;
    }

    @Override
    public double getArea() {
        double value = 5 * (5 + 2 * Math.sqrt(5));
        return .25 * Math.sqrt(value) * Math.pow(equalSides, 2);
    }

    @Override
    public double getHeight() {
        return equalSides * Math.sqrt(5 + 2 * Math.sqrt(5)) / 2;
    }

    @Override
    public double getPerimeter() {
        return equalSides * 5;
    }

    @Override
    public String toString() { return "Pentagon"; }

}
