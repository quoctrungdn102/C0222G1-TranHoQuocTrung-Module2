package _07_abstract_interface.exercise.resizeable;

public class Test {
    public static void main(String[] args) {
        double random = (int) Math.floor(Math.random() * 99) + 1;

        Shape[] arr = new Shape[3];
        for (int i = 0; i < arr.length; i++) {

            arr[0] = new Circle("blue", 5);
            arr[1] = new Rectangle("black", 5, 6);
            arr[2] = new Square("pink", 7);
            System.out.println("Area before " + arr[i].getArea());
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i].resize(random);
            System.out.println("Area after " + arr[i].getArea());
        }
    }
}




