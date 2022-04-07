package _06_inheritance.practice;

public class Circle extends Shape {
    private double radius;
    public Circle() {
        this.radius=1.0;
    }

    public Circle(String color, boolean filled,double radius) {
        super(color, filled);
        this.radius = radius;

    }

    public Circle(String color, boolean filled) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(getRadius(),2)*Math.PI;
    }
    public double  getPerimeter(){
        return getRadius()*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}'+super.toString();
    }
}
