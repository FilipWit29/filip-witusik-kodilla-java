package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private double height;
    private double baseLength;

    public Triangle(double height, double baseLength) {
        this.height = height;
        this.baseLength = baseLength;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return height * baseLength / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(height, triangle.height) == 0 && Double.compare(baseLength, triangle.baseLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, baseLength);
    }
}
