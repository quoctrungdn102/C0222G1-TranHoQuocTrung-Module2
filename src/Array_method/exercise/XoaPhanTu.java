package Array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        while (true){
            System.out.println("enter size array");
            size = scanner.nextInt();
            if (size>10){
                System.out.println("size < 10");
            }else {
                break;
            }
        }

        int[]arr = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("nhap phan tu "+(i+1));
           arr[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(" nhap phan tu can xoa ");
        int nhap = scanner.nextInt();
        int index = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(nhap==arr[i]){
                index = i;

            }
        }
        System.out.println(index);
        for (int i = index; i <arr.length-1 ; i++) {
            arr[i]=arr[i+1];

            }arr[arr.length-1]=0;
        System.out.println(Arrays.toString(arr));
        }

        // 7, 8, 9, 4, 4
    }

