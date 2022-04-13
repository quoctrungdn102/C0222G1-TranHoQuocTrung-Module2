package _07_abstract_interface.exercise.resizeable;

public class Square extends Shape  {
    private double side;



    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.getSide(),2);
    }



    @Override
    public void resize(double percent) {
double side = this.side+this.getSide()*percent/100;
setSide(side);
    }
}
