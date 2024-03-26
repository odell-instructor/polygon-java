package com.polygon.model.base;

import java.util.Objects;

public abstract class Triangle extends Polygon {

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super(3);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() { return sideA; }

    public double getSideB() { return sideB; }

    public double getSideC() { return sideC; }

    @Override
    public double getArea() {
        return sideB * .5 * getHeight();
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Triangle triangle = (Triangle) obj;
        return Double.compare(sideA, triangle.sideA) == 0 &&
                Double.compare(sideB, triangle.sideB) == 0 &&
                Double.compare(sideC, triangle.sideC) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sideA, sideB, sideC);
    }

    @Override
    public String toString() {
        return "Triangle";
    }

}
