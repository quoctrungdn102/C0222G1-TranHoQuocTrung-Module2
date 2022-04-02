package _03_Array_method.practice;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] List = {"trung tran", "dinh luan"};
        System.out.println("enter your name");
        String nhap = scanner.nextLine();
        int count=0;
        for (int i = 0; i < List.length; i++) {
            if (List[i].equals(nhap)) {
                count++;
            }
            }if(count==1){
            System.out.println(nhap+" in list");
        }else {
            System.out.println(nhap+" out list");
        }
    }
}
