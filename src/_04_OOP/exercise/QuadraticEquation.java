package _04_OOP.exercise;

import java.util.Scanner;

public class QuadraticEquation {
private double a,b,c;

    public QuadraticEquation(){

    }
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return (Math.pow(this.b,2) - 4*this.a*this.c);
    }
    public double  getRoot1(){
        return ((-this.b)+Math.pow(this.b*this.b-4*this.a*this.c,0.5))/2*this.a;
    }
    public double  getRoot2(){
        return ((-this.b)-Math.pow(this.b*this.b-4*this.a*this.c,0.5))/2*this.a;
    }
    public String display(){
        return " The equation has no roots";
    }


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

