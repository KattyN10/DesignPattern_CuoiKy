package com.example.springboot.creationalpatterns.factorymethod.factory.circle;

import com.example.springboot.creationalpatterns.factorymethod.factory.Geometry;
import com.example.springboot.creationalpatterns.factorymethod.shape.Shape;
import com.example.springboot.creationalpatterns.factorymethod.shape.circle.Circle;

public class CircleGeometry extends Geometry {

    private double radius;

    public CircleGeometry(double radius) {
        this.radius = radius;
    }

    @Override
    public Shape createShape() {
        return new Circle(radius);
    }
}
