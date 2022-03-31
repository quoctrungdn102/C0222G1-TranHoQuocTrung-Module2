package _01_introduction_java.practice;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("height:");
        double height = scanner.nextDouble();
        System.out.println("weight");
        double weight = scanner.nextDouble();
        double bmi = weight/(height*height);
        if (bmi<18.5){
            System.out.println("underweight");
        }else if(bmi>=18.5 && bmi<25.0){
            System.out.println("normal");
        }else if(bmi>=25.5&& bmi<30.0){
            System.out.println("overweight");
        }else {
            System.out.println("obese");
        }
    }
}
