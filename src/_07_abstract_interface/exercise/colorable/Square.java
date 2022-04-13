package _07_abstract_interface.exercise.colorable;

import _07_abstract_interface.exercise.resizeable.Shape;

public class Square extends Shape implements Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return Math.pow(this.getSide(),2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}'+"Area ="+ this.getArea();
    }

    @Override
    public void howToColor() {
        System.out.println( "color all four sides");
    }

    @Override
    public void resize(double percent) {

    }
}
