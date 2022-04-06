package _04_OOP.exercise.quadratic_equation;

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


}

