package com.polygon.model.sub;

import com.polygon.model.base.Quadrilateral;

public class Parallelogram extends Quadrilateral {

    private final int angle;

    public Parallelogram(double length, double width, int angle) {
        super(length, width, length, width);
        this.angle = angle;
    }

    @Override
    public double getArea() {
        return getSideA() * getSideB() *
                Math.sin(Math.toRadians(angle));
    }

    @Override
    public double getHeight() {
        return getArea() / getSideC();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getSideA() + getSideB());
    }

    @Override
    public String toString() { return "Parallelogram"; }

}
