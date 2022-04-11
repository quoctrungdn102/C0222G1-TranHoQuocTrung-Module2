package _07_abstract_interface.exercise.colorable;

import _06_inheritance.exercise.circle.Cylinder;
import _07_abstract_interface.exercise.resizeable.Circle;
import _07_abstract_interface.exercise.resizeable.Rectangle;
import _07_abstract_interface.exercise.resizeable.Shape;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape[] arr = new Shape[4];
        arr[0] = new Square(5);
        arr[1] = new Circle("blue", 5);
        arr[2] = new Square(7);
        arr[3]= new Rectangle("black",5,6);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Colorable) {
                ((Square) arr[i]).howToColor();
            } else {
                System.out.println("Area = "+arr[i].getArea());
            }
        }
    }
}
