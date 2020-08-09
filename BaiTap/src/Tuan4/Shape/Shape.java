package Tuan4.Shape;

public abstract class Shape {
    protected double PI = 3.14d;
    protected String color;
    protected boolean filled;

    public Shape(){

    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ']';
    }
}
