package com.polygon.model.sub;

import com.polygon.model.base.Quadrilateral;

public class Rectangle extends Quadrilateral {

    public Rectangle(double length, double width) {
        super(length, width, length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (getSideA() + getSideB());
    }

    @Override
    public String toString() { return "Rectangle"; }

}
