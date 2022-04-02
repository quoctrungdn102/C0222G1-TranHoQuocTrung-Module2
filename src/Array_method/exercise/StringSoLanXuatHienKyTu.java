package Array_method.exercise;

import java.util.Scanner;

public class StringSoLanXuatHienKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap 1 chuoi ");
        String str1 = scanner.nextLine();
        String str2;
        while (true){
            System.out.println("nhap 1 ky tu ");
           str2 = scanner.nextLine();
            if(str2.length() != 1){
                System.out.println("enter one chart");
            }else {
                break;
            }
        }
        int count = 0;
        for (int i = 0; i <str1.length() ; i++) {
            if(str2.charAt(0)==str1.charAt(i)){
                count++;
            }
        }if(count==0){
            System.out.println("chart not find in String");
        }else {
            System.out.println("ky tu xuat hien :" +count+"lan");
        }

    }
}
