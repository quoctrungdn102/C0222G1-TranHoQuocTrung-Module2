package _13_search_algorithm.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaxString {
    public static void main(String[] args) {
        String string = "Welcome";
        List<Character> list = new ArrayList<>();
        list.add(string.charAt(0));
        for (int j = 0; j < string.length(); j++) {
            if (string.charAt(j) > list.get((list.size() - 1))) {
                list.add(string.charAt(j));
            }
        }


        String [] arr = new String[list.size()];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= String.valueOf(list.get(i));
        }
        String string1 = String.join("",arr);
        System.out.println(string1);
    }
}








