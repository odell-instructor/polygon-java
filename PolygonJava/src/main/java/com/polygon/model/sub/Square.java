package com.polygon.model.sub;

import com.polygon.model.base.Quadrilateral;

public class Square extends Quadrilateral {

    public Square(double sideLength) {
        super(sideLength, sideLength, sideLength, sideLength);
    }

    @Override
    public double getPerimeter() {
        return getNumberOfSides() * getSideA();
    }

    @Override
    public String toString() { return "Square"; }

}
