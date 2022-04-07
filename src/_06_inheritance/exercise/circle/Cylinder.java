package _06_inheritance.exercise.circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color,double height) {
        super(radius, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(){
        return (Math.PI*Math.pow(getRadius(),2)*getHeight());
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height
                +super.toString()+'}';
    }
}
