package _15_exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        boolean flash = true;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("nhap cạnh thứ nhất");
                int triangleEdge1 = scanner.nextInt();
                System.out.println("nhap cạnh thứ hai");
                int triangleEdge2 = scanner.nextInt();
                System.out.println("nhap cạnh thứ ba");
                int triangleEdge3 = scanner.nextInt();
                Triangle triangle = new Triangle(triangleEdge1, triangleEdge2, triangleEdge3);

            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
                continue;
            }catch (InputMismatchException e){
                System.err.println("nhap số vào");
                continue;
            }
            flash = false;



        }while (flash);

    }
}
