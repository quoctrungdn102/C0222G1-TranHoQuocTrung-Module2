package _14_sort_algorithm.exercise;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr = {5,6,2,8,48,7,4};
        for (int i = 1; i <arr.length ; i++) {
            int tempt = arr[i];
            int index = i;
            System.out.println(Arrays.toString(arr));
            while (index>0&& tempt< arr[index-1]){
                arr[index]= arr[index-1] ;

                index--;
            }
             arr[index]=tempt;

        }

    }

}
