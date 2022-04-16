package _12_java_colection_framework.exercise.linked_list;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Product> list1 = new LinkedList<>();
        ProductManager productManager = new ProductManager();
        Product product = new Product("thuoc ngua ", 20000);
        Product product1 = new Product("thuốc mèo", 15000);
        list1.add(product);
        list1.add(product1);
//        for (Product arr :list1) {
//            System.out.println(arr);
//        }


        int chose = -2;
        while (chose!=6){
            System.out.println("menu");
            System.out.println("1.show list");
            System.out.println("2 add product");
            System.out.println("3 delete product");
            System.out.println("4 search product");
            System.out.println("5 sắp xếp lại ");
            System.out.println("6 Exit");
            chose = Integer.parseInt(scanner.nextLine());
            switch (chose){
                case 1:
                    productManager.showList(list1);
                    break;
                case 2:
                    productManager.addProduct(list1);
                    productManager.showList(list1);
                    break;
                case 3:
                    productManager.removeProduct(list1);
                    productManager.showList(list1);
                    break;
                case 4:
                    productManager.search(list1);
                    break;
                case 5:
                    productManager.sort(list1);
                    productManager.showList(list1);
                    break;
                case 6:
                    System.out.println("bye bye");

            }

        }
    }

}
