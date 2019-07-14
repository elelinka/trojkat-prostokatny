package com.google;

public class TriangleController {

    public boolean isRightTriangle(Triangle triangle) {
        return ((triangle.sideA * triangle.sideA) + (triangle.sideB * triangle.sideB) == triangle.sideC * triangle.sideC)
                || ((triangle.sideA * triangle.sideA) + (triangle.sideC * triangle.sideC) == triangle.sideB * triangle.sideB)
                || ((triangle.sideB * triangle.sideB) + (triangle.sideC * triangle.sideC) == triangle.sideA * triangle.sideA);
    }
}
