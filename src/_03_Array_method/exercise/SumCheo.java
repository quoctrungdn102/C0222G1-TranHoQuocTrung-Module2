package _03_Array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter row");
        int row = scanner.nextInt();
        int column = row;
        int[][]arr = new int[row][column];
        System.out.println("arr co "+(row*row)+"phan tu ");
        System.out.println("nhap phan tu trong arr");
        int count = 1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println("nhap phan tu thu "+count);
                arr[i][j]=scanner.nextInt();
                count++;
            }

        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println("");
        }
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i][i];
        }
        System.out.println("sum cheo ="+ sum);

    }
}
