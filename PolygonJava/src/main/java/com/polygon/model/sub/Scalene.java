package com.polygon.model.sub;

import com.polygon.model.base.Triangle;

public class Scalene extends Triangle {

    public Scalene(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public double getHeight() {
        double infoA = -getSideA() + getSideB() + getSideC();
        double infoB = getSideA() - getSideB() + getSideC();
        double infoC = getSideA() + getSideB() - getSideC();
        return .5 * Math.sqrt(getPerimeter() * infoA *
                infoB * infoC) / getSideB();
    }

    private double semiPerimeter() {
        return getPerimeter() / 2;
    }

    @Override
    public double getArea() {
        double infoA = semiPerimeter() *
                (semiPerimeter() - getSideA());
        double infoB = semiPerimeter() - getSideB();
        double infoC = semiPerimeter() - getSideC();
        return Math.sqrt(infoA * infoB * infoC);
    }

    @Override
    public String toString() {
        return "Scalene Triangle";
    }
}
