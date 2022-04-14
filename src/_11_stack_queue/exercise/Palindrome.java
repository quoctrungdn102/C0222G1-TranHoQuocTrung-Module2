package _11_stack_queue.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String>stack = new Stack<>();
        Queue<String>queue = new LinkedList<>();
        System.out.println("nhap chuoi");
        String nhap = scanner.nextLine();
        String[]arr = nhap.toUpperCase().split("");
        for (String s : arr) {
            stack.push(s);
            queue.add(s);
        }
        String str1="";
        String str2="";
        for (int i = 0; i <arr.length ; i++) {
            str1+=stack.pop();
            str2+=queue.poll();
        }
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.equals(str2));

    }
}
