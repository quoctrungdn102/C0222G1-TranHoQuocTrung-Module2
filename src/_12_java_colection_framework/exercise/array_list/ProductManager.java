package _12_java_colection_framework.exercise.array_list;


import c_r_u_d.add_ex.Person;

import java.util.*;

import _12_java_colection_framework.exercise.array_list.Product;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);

//    static List<Product> list = new ArrayList<>();

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

        while (true) {
            System.out.println("nhap id san phan muon  sữa");
            int id = Integer.parseInt(scanner.nextLine());
            if (id < list.size()) {
                System.out.println("nhap san pham moi");
                list.get(id).setName(scanner.nextLine());
                System.out.println("nhap gia moi");
                list.get(id).setGia((scanner.nextDouble()));
                break;
            } else {
                System.out.println("id out size list");

            }
        }

    }

    public void removeProduct(List<Product> list) {
        System.out.println("nhap id san pham ban muon xoa ");
        int id = Integer.parseInt(scanner.nextLine());
        if (id < list.size()) {
            list.remove(id);
            showList(list);
                }else {
            System.out.println("id not correct");
            }
        }

    public boolean search(List<Product> list) {
        System.out.println("nhap san phan muon tim kiem ");
        String index = scanner.nextLine();
        for (Product arr : list) {
            if(index.contains(arr.getName())){
                return true;
            }
        }return false;
    }

    public void sort(List<Product> list) {
        Collections.sort(list, new ProductCompara());
    }
    public void sort1(List<Product>list){
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getGia()-o1.getGia());
            }
        });
    }


}
