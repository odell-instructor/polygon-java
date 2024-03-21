package com.polygon.model.base;

import java.util.Objects;

public abstract class Quadrilateral extends Polygon {

    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final double sideD;

    public Quadrilateral(double sideA, double sideB,
                         double sideC, double sideD) {
        super(4);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public double getSideA() { return sideA; }

    public double getSideB() { return sideB; }

    public double getSideC() { return sideC; }

    public double getSideD() { return sideD; }

    @Override
    public double getHeight() { return sideB;}

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        if(!super.equals(obj)) return false;
        Quadrilateral that = (Quadrilateral) obj;
        return Double.compare(sideA, that.sideA) == 0 &&
                Double.compare(sideB, that.sideB) == 0 &&
                Double.compare(sideC, that.sideC) == 0 &&
                Double.compare(sideD, that.sideD) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sideA, sideB, sideC, sideD);
    }

    @Override
    public String toString() {
        return "Quadrilateral";
    }

}
