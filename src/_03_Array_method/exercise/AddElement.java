package _03_Array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 0, 0};//8
        System.out.println("nhap so can chen");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int index = 0;
        index = inputIndex(index,scanner,arr);
        System.out.println(Arrays.toString(deleteElement(arr,index,x)));


    }
    public static int[] deleteElement(int[] arr, int index, int x){
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;
        return arr;
    }
    public static int inputIndex(int index,Scanner scanner,int[]arr){

        while (true) {
            System.out.println("nhap vi tri can chen");
            index = scanner.nextInt();
            if (index <= -1 || index >= arr.length) {
                System.out.println("nhap lai ");
            } else {
                return index;
            }
        }
    }
}
