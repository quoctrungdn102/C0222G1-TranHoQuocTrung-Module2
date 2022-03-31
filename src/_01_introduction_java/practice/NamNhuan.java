package _01_introduction_java.practice;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap nam can xem ");
        int nam = scanner.nextInt();
        if(nam%4==0 || nam%100==0 && nam%400==0){
            System.out.println(nam + "la nam nhuan ");
        }else {
            System.out.println(nam+ "khong phai la nam nhuan ");
        }
    }
}
