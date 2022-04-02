package Array_method.exercise;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[4];
        System.out.println("nhap cac phan tu arr1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[5];
        System.out.println("nhap cac phan tu arr2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[9];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        System.out.println("gop 2 mang ");
        System.out.println(Arrays.toString(arr3));
    }
}
