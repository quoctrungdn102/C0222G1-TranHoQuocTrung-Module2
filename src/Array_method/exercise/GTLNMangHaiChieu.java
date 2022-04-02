package Array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class GTLNMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter row");
        int row = scanner.nextInt();

        System.out.println("enter column ");
        int column = scanner.nextInt();

        int[][]arr = new int[row][column];
        int phanTu;
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(" enter element row  "+(i+1));
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=scanner.nextInt();
            }

        }
        System.out.println(Arrays.deepToString(arr));
        int index = 0;
        int index1 = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
               if (arr[i][j]>arr[index][index1]){
                   index = i;
                   index1 =j;
               }

            }
        }
        System.out.println("max:"+arr[index][index1]);
    }
}
