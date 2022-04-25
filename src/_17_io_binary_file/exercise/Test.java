package _17_io_binary_file.exercise;


import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Test {
    private static final String LINK  =  "_17_io_binary_file\\exercise\\list.txt";;
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
                  List<Product> list= productControl.readFile(LINK);
                    for (Product arr: list) {
                        System.out.println(arr.toString());
                    }
                    break;
                case 2:
                    productControl.addProduct(productControl.list, LINK);
                    break;
                case 3:
                    System.out.println( productControl.searchProduct(LINK));
                    break;
                case 4:
                    System.exit(0);

            }
        }
    }

}
