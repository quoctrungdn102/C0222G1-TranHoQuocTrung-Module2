package _03_Array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class GTNNArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]arr = new int[8];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("nhap phan tu thu "+(i+1));
            arr[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int index=0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[index]>arr[i]){
                index = i;
            }
        }
        System.out.println("min= "+arr[index]);
    }
}
