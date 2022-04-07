package _06_inheritance.practice;

public class Rectangle extends Shape {
    private double width =1.0;
    private double length=1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getPerimeter(){
        return ((getWidth()+getLength())*2);
    }

    @Override
    public String toString() {
        return "A Rectangle with" +
                "width=" + width +
                ", length=" + length +
                '}'+super.toString();
    }
}
