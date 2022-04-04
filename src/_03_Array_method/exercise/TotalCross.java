package _03_Array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TotalCross {
    public static void main(String[] args) {
        int row = 0;
        row = inputRow(row);


        int[][] arr = new int[row][row];

        System.out.println("arr co " + (row * row) + "phan tu ");
        System.out.println("nhap phan tu trong arr");
        inputElement(arr);
        showElemen(arr);
        System.out.println("sum cross " + Sum(arr));


    }

    public static void inputElement(int[][] arr) {
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("nhap phan tu thu " + count);
                arr[i][j] = scanner.nextInt();
                count++;
            }
        }
    }

    public static void showElemen(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static int Sum(int arr[][]) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            sum1 += arr[i][arr.length - 1 - i];

        }

        return sum + sum1;
    }

    public static int inputRow(int row) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter row");
        while (true) {
            row = scanner.nextInt();
            if (row < 2) {
                System.out.println("row >= 2");
            } else {
                break;
            }
        }
        return row;
    }

}
