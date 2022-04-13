package _07_abstract_interface.exercise.resizeable;

public class Circle extends Shape  {
    private double radius;


    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        double temp = this.getRadius() + (this.getRadius() * percent / 100);
        this.setRadius(temp);
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
