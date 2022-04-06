package _04_OOP.exercise.quadratic_equation;

import java.util.Scanner;

public class QuadraticEquationText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a");
        double a = scanner.nextDouble();
        System.out.print("enter b");
        double b = scanner.nextDouble();
        System.out.print("enter c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation1 = new QuadraticEquation(a,b,c);

        if(quadraticEquation1.getDiscriminant()>0){
            System.out.println("x1 = "+quadraticEquation1.getRoot1());
            System.out.println("x2 = "+quadraticEquation1.getRoot2());
        }else if((quadraticEquation1.getDiscriminant()==0)){
            System.out.println("x1=x2 = "+quadraticEquation1.getRoot1());
        }else {
            System.out.println(quadraticEquation1.display());
        }
    }
}
