package _13_search_algorithm.practice;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmicComplexity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nhap = scanner.nextLine();
        int[]arr = new int[255];
        for (int i = 0; i <nhap.length() ; i++) {
            int ascii = nhap.charAt(i);
            arr[ascii]+=1;
        }

     //   System.out.println(Arrays.toString(arr));
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (arr[j] > max) {
                max = arr[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");

    }
}
