package _07_abstract_interface.exercise.resizeable;

public class Test {
    public static void main(String[] args) {
        double random = Math.floor(Math.random()*99)+1;

        System.out.println("circle area");
        Circle circle = new Circle("blue",5);
        System.out.println("before="+circle.getArea());
        circle.resize(random);
        System.out.println("after="+circle.getArea());

        System.out.println("rectangle area");
        Rectangle rectangle = new Rectangle("black",5,6);
        System.out.println("before="+rectangle.getArea());
        rectangle.resize(random);
        System.out.println("after="+rectangle.getArea());

        System.out.println("square area");
        Square square = new Square("pink",7);
        System.out.println("before="+square.getArea());
        square.resize(random);
        System.out.println("after= "+square.getArea());
    }
}
