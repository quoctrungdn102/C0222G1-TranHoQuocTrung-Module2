package Array_method.practice;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        int chose=5;
        Scanner scanner = new Scanner(System.in);

        while (chose!=0){
            System.out.println("menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0.Exit");
            System.out.println("chose 1,2 0r 0");
            chose = scanner.nextInt();
            switch (chose){
                case 1:
                    System.out.println("enter Fahrenheit");
                    double f = scanner.nextDouble();
                    System.out.println("Celsius ="+doF(f));
                    break;
                case 2:
                    System.out.println("enter Celsius ");
                    double c = scanner.nextDouble();
                    System.out.println("Fahrenheit ="+doC(c));
                    break;
                case 0:
                    System.exit(0);

            }
        }

    }

    public static double doC (double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return  doF;
    }
    public static double doF(double doF){
        double doC =  (5.0 / 9) * (doF - 32);
        return doC;
    }
}
