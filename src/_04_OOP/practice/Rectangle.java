package _04_OOP.practice;

import java.util.Scanner;

public class Rectangle {

    double width,height;
    public Rectangle(){
    }
    public Rectangle(double width,double height){
        this.width = width;
        this.height =height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return this.width+this.height;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter width");
        double width = scanner.nextInt();
        System.out.println("enter height");
        double height = scanner.nextDouble();

        Rectangle rectangle1 = new Rectangle(width,height);
        System.out.println(rectangle1.display());
        System.out.println( "dien tich"+ rectangle1.getArea());
        System.out.println("chu vi "+rectangle1.getPerimeter());
    }
}
