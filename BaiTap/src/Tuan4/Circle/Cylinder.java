package Tuan4.Circle;

import Tuan4.Circle.Circle;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {
        super();
        this.height = 1.0d;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0d;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = 1.0d;
    }

    @Override
    public String toString() {
        return "Cylinder[" +super.toString()+ ", height=" + height+ ']';
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}
