package Geometry;

public class Circle extends Shape{
    private double radius = 1.0;

    Circle(){
        super();
    }

    Circle(double radius){
        super();
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "Circle[" + super.toString() +
                ",radius=" + radius +
                ']';
    }
}
