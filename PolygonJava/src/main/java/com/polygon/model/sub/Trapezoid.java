package com.polygon.model.sub;

import com.polygon.model.base.Quadrilateral;

public class Trapezoid extends Quadrilateral {

    private final int angle;

    public Trapezoid(double sideA, double sideC,
                     double sideB, double sideD, int angle) {
        super(sideA, sideC, sideB, sideD);
        this.angle = angle;
    }

    @Override
    public double getHeight() {
        return getSideC() * Math.sin(Math.toRadians(angle));
    }

    @Override
    public double getArea() {
        return .5 * (getSideA() + getSideC()) * getHeight();
    }

    @Override
    public double getPerimeter() {
        return getSideA() + getSideB() +
                getSideC() + getSideD();
    }

    @Override
    public String toString() { return "Trapezoid"; }

}
