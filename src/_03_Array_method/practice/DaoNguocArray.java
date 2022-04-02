package _03_Array_method.practice;

import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai cua mang ");
        int length;
        int[] array;
        while (true){
            length = scanner.nextInt();
            if (length<=20){
                break;
            }else {
                System.out.println("nhap be hon 20");
            }
        }
        array = new int[length];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("nhap cac phan tu thu "+(i+1));
            array[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i <array.length/2 ; i++) {
            int temp = array[i];
            array[i]=array[length-1-i];
            array[length-1-i]= temp;
        }
        System.out.println(Arrays.toString(array));

    }
}
