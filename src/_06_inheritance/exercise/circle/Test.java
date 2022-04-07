package _06_inheritance.exercise.circle;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"black");
        System.out.println(circle);
        System.out.println("Area circle  = "+circle.getArea());
        Cylinder cylinder =new Cylinder(6,"blue",10);
        System.out.println(cylinder);
        System.out.println("area cylinder = "+cylinder.getArea());
        System.out.println("volume cylinder = "+cylinder.volume());
    }
}
