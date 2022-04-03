package _02_loop_java.exercise;

import java.util.Scanner;

public class _20PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong so nguyen to can hien thi ");
        int soLuong = scanner.nextInt();

        int count1 = 0;
        for (int i = 2; i < 200; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }if (count == 2) {
                System.out.println(i);
                count1++;

            }  if (count1==soLuong){
                break;
            }
        }
    }
}