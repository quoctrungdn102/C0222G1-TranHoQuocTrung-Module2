package _07_abstract_interface.exercise.resizeable;

public class Test {
    public static void main(String[] args) {
        double random = Math.floor(Math.random()*99)+1;
        Circle circle = new Circle("blue",5);
        System.out.println(circle);
        circle.resize(random);
        System.out.println(circle);
    }
}
