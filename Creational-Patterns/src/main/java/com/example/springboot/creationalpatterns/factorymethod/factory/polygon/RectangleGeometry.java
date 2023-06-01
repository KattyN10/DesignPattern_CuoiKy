package com.example.springboot.creationalpatterns.factorymethod.factory.polygon;

import com.example.springboot.creationalpatterns.factorymethod.factory.Geometry;
import com.example.springboot.creationalpatterns.factorymethod.shape.Shape;
import com.example.springboot.creationalpatterns.factorymethod.shape.rectangle.Rectangle;

public class RectangleGeometry extends Geometry {

    private double length;
    private double breadth;

    public RectangleGeometry(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public Shape createShape() {
        return new Rectangle(length, breadth);
    }
}
