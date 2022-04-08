package _07_abstract_interface.exercise.resizeable;

public class Square implements Resizeable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void resize(double percent) {

    }
}
