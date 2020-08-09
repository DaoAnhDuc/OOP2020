package Tuan4.Circle;

public class Circle {
    protected final double PI = 3.14d;
    private double radius;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public Circle(){
        this.radius = 1.0d;
        this.color = "red";
    }

    public Circle(double radius){
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ']';
    }

    public double getArea(){
        return PI *PI * this.getRadius();
    }
}
