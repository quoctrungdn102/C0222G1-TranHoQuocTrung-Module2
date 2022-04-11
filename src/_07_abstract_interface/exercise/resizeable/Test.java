package _07_abstract_interface.exercise.resizeable;

public class Test {
    public static void main(String[] args) {
        double random = Math.floor(Math.random()*99)+1;

        Shape [] arr = new Shape[3];
        for (int i = 0; i < arr.length ; i++) {

            arr [0] = new Circle("blue",5);
            arr[1]= new Rectangle("black",5,6);
            arr[2]=new Square("pink",7);
            System.out.println("Area before "+arr[i].getArea());
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length ; i++) {
            arr [0] = new Circle("blue",5);
            ((Circle) arr[0]).resize(random);

            arr[1]= new Rectangle("black",5,6);
            ((Rectangle) arr[1]).resize(random);

            arr[2]=new Square("pink",7);
            ((Square) arr[2]).resize(random);
            System.out.println("Area after"+arr[i].getArea());

        }




//        System.out.println(((Square) arr[2]).getArea());
//        System.out.println( ((Circle) arr[0]).getArea());
//        System.out.println( ((Rectangle) arr[1]).getArea());



//        System.out.println("circle area");
//        Circle circle = new Circle("blue",5);
//        System.out.println("before="+circle.getArea());
//        circle.resize(random);
//        System.out.println("after="+circle.getArea());
//
//        System.out.println("rectangle area");
//        Rectangle rectangle = new Rectangle("black",5,6);
//        System.out.println("before="+rectangle.getArea());
//        rectangle.resize(random);
//        System.out.println("after="+rectangle.getArea());
//
//        System.out.println("square area");
//        Square square = new Square("pink",7);
//        System.out.println("before="+square.getArea());
//        square.resize(random);
//        System.out.println("after= "+square.getArea());
    }
}
