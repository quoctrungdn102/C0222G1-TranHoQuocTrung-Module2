package _07_abstract_interface.practice.comparable;

import _07_abstract_interface.practice.comparable.Circle;

public class Test extends Circle implements Comparable<Circle> {
    public Test(double radius, String color) {
        super(radius, color);
    }

    public static void main(String[] args) {

        Circle circle1 = new Circle(5.0, "blue");
        Circle circle2 = new Circle(10.0, "black");
        Circle circle3 = new Circle(3.0, "black1");
        Circle circle4 = new Circle(15.0, "black3");

//        Test[] arr = {(Test) circle1, (Test) circle2, (Test) circle3, (Test)circle4};
        Circle[] arr = {circle1,circle2,circle3,circle4};

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
