package _01_introduction_java.exercise;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();
        System.out.println("hello"+name);
    }
}

