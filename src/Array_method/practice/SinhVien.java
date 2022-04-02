package Array_method.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so kuong sinh vien can kiem tra ");
        int nhap;
        while (true) {
            nhap = scanner.nextInt();
            if (nhap > 30 || nhap <= 0) {
                System.out.println("nhap lai ");
            } else {
                break;
            }
        }
        int[] arr = new int[nhap];
        for (int i = 0; i < arr.length; ) {
            System.out.print("nhap diem sinh vien thu " + (i + 1)+":");
            int diem = scanner.nextInt();
            if (diem < 0 || diem > 10) {
                System.out.println("diem >= 0 && < 10");
            } else {
                arr[i] = diem;
                i++;
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                count++;
            }
        }
        System.out.println("so sinh vien thi đo la: " + count);

    }
}
