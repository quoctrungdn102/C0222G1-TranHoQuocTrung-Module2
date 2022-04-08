package _07_abstract_interface.practice.comparable;

import java.util.Arrays;

public class Circle implements Comparable<Circle> {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.pow(getRadius(),2)*Math.PI;
    }

    @Override
    public String toString() {
        return "radius=" + radius +
                "Area= " + getArea() +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0, "blue");
        Circle circle2 = new Circle(10.0, "black");
        Circle circle3 = new Circle(3.0, "black1");
        Circle circle4 = new Circle(15.0, "black3");

        Circle[] arr = {circle1,circle2,circle3,circle4};


        Arrays.sort(arr);

        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

    @Override
    public int compareTo(Circle o) {
        if (this.getArea() > o.getArea()) return 1;
        else if (this.getArea() < o.getArea()) return -1;
        else return 0;
    }
}
