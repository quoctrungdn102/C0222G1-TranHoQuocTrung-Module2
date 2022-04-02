package Array_method.practice;

import java.util.Arrays;
import java.util.Scanner;

public class GiaTriLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number of value in array ");
        int size;
        while (true) {
            size= scanner.nextInt();
            if (size>20){
                System.out.println("number of value < 20");
            }else {
                break;
            }
        }

        int[]arr = new int[size];
        for (int i = 0; i < size ; i++) {
            System.out.println("enter value" +(i+1));
            arr[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int index = 0;
        for (int value : arr) {
            if (value > max) {
                max = value;
                index++;

            }

        }
        System.out.println("max = "+max+ "\nindex :"+index);
    }
}
