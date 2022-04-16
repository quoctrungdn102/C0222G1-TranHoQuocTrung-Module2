package _11_stack_queue.exercise;

import java.util.*;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("nhap 1 so thap phan ");
        int nhap = scanner.nextInt();
        while (nhap > 0) {
            int binary = nhap % 2;

            nhap = nhap / 2;
            stack.push(binary);
        }
        System.out.println(stack);
    }

}

