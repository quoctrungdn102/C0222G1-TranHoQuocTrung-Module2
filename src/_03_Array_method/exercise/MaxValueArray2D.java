package _03_Array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValueArray2D {
    public static void main(String[] args) {
        int[][] arr = showArr2d();
        System.out.println(Arrays.deepToString(arr));
        System.out.println("max = "+maxValue(arr));

    }

    public static int[][] showArr2d() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter row");
        int row = scanner.nextInt();

        System.out.println("enter column ");
        int column = scanner.nextInt();

        int[][] arr = new int[row][column];
        int phanTu;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" enter element row  " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }

        }
        return arr;
    }

    public static int maxValue(int[][] arr) {
        int rowMax = 0;
        int columnMax = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > arr[rowMax][columnMax]) {
                    rowMax = i;
                    columnMax = j;
                }

            }
        }
        return arr[rowMax][columnMax];
    }
}
