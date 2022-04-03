package _02_loop_java.exercise;

import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chose = 1;
        while (chose !=4){
            System.out.println("chose 1 2 3 4");
            System.out.println("1.print the rectangle");
            System.out.println("2.print the square triangle");
            System.out.println("3.print isosceles triangle");
            System.out.println("4. Exit ");
            chose = scanner.nextInt();
            switch (chose){
                case 2:
                    for (int i = 0; i <5  ; i++) {
                        for(int j = 0; j<=i;j++){
                            System.out.print(" * ");
                        }
                        System.out.println("  ");
                    }
                    System.out.println(" ");
                    for (int i = 0; i < 5 ; i++) {
                        for (int j = i; j<5 ; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }break;
                case 1  :
                    for (int i = 0; i < 3 ; i++) {
                        for (int j =0;j<9;j++ ){
                            System.out.print("* ");
                        }
                        System.out.println(" ");
                    }break;
                case 3:
                    for (int i = 0; i <7 ; i++) {
                        for (int j = i; j <7 ; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <=i ; j++) {
                            System.out.print(" *");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("bye bye");
                    break;
                default:
                    System.out.println("chose 1 2 3 4 ");

            }
        }
    }
}
