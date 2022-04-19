package _14_sort_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MethodInsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new  int[5];
        System.out.println("nhap cac phan tu");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= scanner.nextInt();
        }
        insertionSort(arr);
    }
    public static void  insertionSort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            int temp = arr[i];
            int index = i;
            while (index>0 && temp < arr[index-1]){
                arr[index]=arr[index-1];
                index--;
            }
            arr[index]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
