package _03_Array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TotalCross {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter row");
        int row;
        while (true){
            row = scanner.nextInt();
            if (row<2){
                System.out.println("row >= 2");
            }else {
                break;
            }
        }


        int[][]arr = new int[row][row];
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
