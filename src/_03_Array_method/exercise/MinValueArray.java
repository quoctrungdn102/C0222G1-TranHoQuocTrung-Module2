package _03_Array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MinValueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]arr = new int[8];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("nhap phan tu thu "+(i+1));
            arr[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("minArray ="+min(arr) );
    }
    public static int min(int[] arr){
        int index=0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[index]>arr[i]){
                index = i;
            }
        }
        return arr[index];
    }
}
