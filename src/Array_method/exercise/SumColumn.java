package Array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter row");
        int row = scanner.nextInt();

        System.out.println("enter column");
        int column = scanner.nextInt();

        int[][]arr = new int[row][column];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("enter element row"+(i+1));
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int index;
        while (true){
            System.out.println("enter the  column you want to sum  ");
            index = scanner.nextInt();
            if(index > column||index<=0){
                System.out.println("column false");
            }else {
                break;
            }
        }

        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum+= arr[i][index-1];
            }
        System.out.println("sum is column"+index+"="+sum);
        }
    }


