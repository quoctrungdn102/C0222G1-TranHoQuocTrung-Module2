package _12_java_colection_framework.exercise.array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        ProductManager productManager = new ProductManager();
        Product product = new Product("xa phong", 30000);
        Product product1 = new Product("dau goi", 25000);
        list.add(product);
        list.add(product1);
        int chose = -1;
        while (chose!=8){
            System.out.println("menu");
            System.out.println("1.show list");
            System.out.println("2 add product");
            System.out.println("3 delete product");
            System.out.println("4 search product");
            System.out.println("5 sắp xếp tăng dần  ");
            System.out.println("6.sắp xếp giảm dần ");
            System.out.println("7 edit product");
            System.out.println("8 Exit");
            chose = Integer.parseInt(scanner.nextLine());
            switch (chose){
                case 1:
                    productManager.showList(list);
                    break;
                case 2:
                    productManager.addProduct(list);
                    productManager.showList(list);
                    break;
                case 3:
                    productManager.removeProduct(list);

                    break;
                case 4:
                    System.out.println(productManager.search(list));
                    break;
                case 5:
                    productManager.sort(list);
                    productManager.showList(list);
                    break;
                case 6:
                    productManager.sort1(list);
                    productManager.showList(list);
                    break;
                case 7:
                    productManager.editById(list);
                    productManager.showList(list);
                    break;
                case 8:
                    System.out.println("bye bye");

            }

        }

    }


}
