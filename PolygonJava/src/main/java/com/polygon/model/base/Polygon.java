package com.polygon.model.base;

import com.polygon.model.impl.Height;

import java.util.Objects;

public abstract class Polygon implements Height {
    private final int numberOfSides;

    public Polygon(int sides) {
        this.numberOfSides = sides;
    }

    protected int getNumberOfSides() { return numberOfSides; }

    public double getInteriorAngle() {
        return (numberOfSides - 2) * 180;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Polygon polygon = (Polygon) obj;
        return numberOfSides == polygon.numberOfSides;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfSides);
    }

    @Override
    public String toString() {
        return "Polygon";
    }

}
