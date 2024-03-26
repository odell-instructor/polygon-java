package com.polygon.base;

import com.polygon.controller.Controller;
import com.polygon.model.sub.*;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.processPolygon(new Trapezoid(10,15,17,22,46));
    }

}
