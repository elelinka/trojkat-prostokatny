package com.google;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 2, 20);
        TriangleController triangleController = new TriangleController();

        boolean isRightT = triangleController.isRightTriangle(triangle);
        System.out.println("is rectangular triangle? " + isRightT);
    }
}
