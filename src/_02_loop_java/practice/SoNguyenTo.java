package _02_loop_java.practice;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your num ");
        int count=0;
        int number = scanner.nextInt();
        for (int i = 1; i <=number ; i++) {
            if(number%i==0){
                count++;
            }
        }if(count==2){
            System.out.println(number+"isPrime");
        }else {
            System.out.println(number+"is not prime" );
        }
    }
}
