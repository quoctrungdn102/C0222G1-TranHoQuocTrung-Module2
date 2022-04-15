package _12_java_colection_framework.exercise.array_list;


import c_r_u_d.add_ex.Person;

import java.util.*;

import _12_java_colection_framework.exercise.array_list.Product;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);

    static List<Product> list = new ArrayList<>();

    public ProductManager() {
    }

    public void showList(List<Product> list) {
        for (Product arr : list) {
            System.out.println(arr);
        }
    }

    public void addProduct(List<Product> list) {

        System.out.println("nhap tem san pham ");
        String name = scanner.nextLine();
        System.out.println("nhap gia ");
        double gia = Double.parseDouble(scanner.nextLine());
        Product product = new Product(name, gia);

        list.add(product);


    }

    public void editById(List<Product> list) {
        System.out.println("nhap san phan muon  sữa");
        String id = scanner.nextLine();


        for (Product temp : list) {
            if (temp.getName().equals(id)) {
                System.out.println("nhap san pham moi");
                temp.setName(scanner.nextLine());
                System.out.println("nhap gia moi");
                temp.setGia(Double.parseDouble(scanner.nextLine()));
            } else {
                break;
            }
        }
    }
    public void removeProduct(List<Product>list){
        System.out.println("nhap san pham ban muon xoa ");
        String index =scanner.nextLine();
        for (Product arr1: list) {
            if (arr1.getName().equals(index)){
                list.remove(arr1);
            }
        }
        showList(list);
    }
    public void search(List<Product>list){
        System.out.println("nhap san phan muon tim kiem ");
        String index = scanner.nextLine();
        for (Product arr:list) {
            if(arr.getName().equals(index)){
                System.out.println(arr);
            }

        }
    }
    public  void sort(List<Product>list){
        Collections.sort(list,new ProductCompara());
    }


}
