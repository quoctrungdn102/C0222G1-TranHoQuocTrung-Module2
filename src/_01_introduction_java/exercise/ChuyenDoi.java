package _01_introduction_java.exercise;

import java.util.Scanner;

public class ChuyenDoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.println("nhap so usd muon doi ");
        usd = scanner.nextDouble();

        double chuyenDoi = usd*23000;

        System.out.println(chuyenDoi+"vnd");
    }
}
