package _01_introduction_java.practice;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        float wight;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        wight = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = wight * height ;
        System.out.println("area is "+area);

    }
}
