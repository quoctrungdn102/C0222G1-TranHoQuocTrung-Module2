package _11_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> bStack = new Stack<>();
        System.out.println("nhap that toán ");
        String nhap = scanner.nextLine();
        String let ="";
        for (int i = 0; i < nhap.length(); i++) {
            if (nhap.charAt(i) == '(') {
                bStack.push(nhap.charAt(i));
            }else if(nhap.charAt(i)==')'){
                if(bStack.size()==0){
                    System.out.println(false);
                }else{
                    let+=nhap.charAt(i);
                }
            }
        }
        if(let.length()==bStack.size()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


        System.out.println(let);
        System.out.println(bStack);

    }
}
