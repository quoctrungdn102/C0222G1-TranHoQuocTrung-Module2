package _11_stack_queue.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ReverseInStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int n = 5;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            arr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));


        // đảo ngược chuỗi
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi ");
        String mWork = scanner.nextLine();
        String[] chart = mWork.split("");

        for (int i = 0; i < chart.length; i++) {
            if(!chart[i].equals(" ")){
                wStack.push(chart[i]);
            }

        }
        String[] arr1 = new String[wStack.size()];
        System.out.println(wStack);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = wStack.pop();
        }
        System.out.println(Arrays.toString(arr1));
        String a =String.join("", arr1);
        System.out.println(a);
    }
}
