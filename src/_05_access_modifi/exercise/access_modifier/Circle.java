package _05_access_modifi.exercise.access_modifier;

public class Circle {
    private double radius;


    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;

    }

    protected double getRadius() {
        return this.radius;
    }
    protected double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}
