package _07_abstract_interface.exercise.resizeable;

public class Rectangle extends Shape  {
    private double wight;
    private double length;

    public Rectangle(String color, double wight, double length) {
        super(color);
        this.wight = wight;
        this.length = length;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void resize(double percent) {
        double wight = this.wight+this.getWight()*percent/100;
        double length = this.length+this.getLength()*percent/100;
        setLength(length);
        setWight(wight);
    }

    @Override
    public double getArea() {
        return this.getLength()*this.getWight();
    }
}
