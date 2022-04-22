package _17_io_binary_file.exercise;


import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ProductControl productControl = new ProductControl();
        int chose = -1;
        while (true) {
            System.out.println("menu");
            System.out.println("1.show list");
            System.out.println("2 add product");
            System.out.println("3 search product");
            System.out.println("4 Exit");
            chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    productControl.showList("_16_io_file.exercise.binary_file\\list.txt");
                    break;
                case 2:
                    productControl.addProduct(productControl.list, "_16_io_file.exercise.binary_file\\list.txt");
                    break;
                case 3:
                    System.out.println( productControl.searchProduct("_16_io_file.exercise.binary_file\\list.txt"));
                    break;
                case 4:
                    System.exit(0);

            }
        }
    }

}
