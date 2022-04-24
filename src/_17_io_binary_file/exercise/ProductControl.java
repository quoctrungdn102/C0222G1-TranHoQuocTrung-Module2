package _17_io_binary_file.exercise;

import java.io.*;
import java.util.*;


public class ProductControl {
     List<Product> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    public  void addProduct(List<Product> list, String path) {
        list = readFile(path);
        int id;
        do {
            System.out.println("nhap id !id list  ");
            id = Integer.parseInt(scanner.nextLine());
        } while (isSameID(id));

        System.out.println("nhap tem san pham ");
        String name = scanner.nextLine();
        System.out.println("hang san xuat");
        String hang = scanner.nextLine();
        System.out.println("nhap gia ");

        double gia = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, hang, gia);


//        list = readFile(path);
        list.add(product);
        writeToFile(path, list);

    }

    private  boolean isSameID(int id) {
        list = readFile("_17_io_binary_file\\exercise\\list.txt");
        for (int i = 0; i < list.size(); i++) {
            if ((int)id == list.get(i).getId()) {
                return true;
            }
        }
        return false;
    }


    public  void writeToFile(String path, List<Product> list) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path,false);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public  List<Product> readFile(String path) {
        List<Product> list = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectOutputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectOutputStream.readObject();
            fileInputStream.close();
            objectOutputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;

    }

    public static void showList(String path) {
        List<Product> list = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectOutputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectOutputStream.readObject();
            fileInputStream.close();
            objectOutputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Product arr : list) {
            System.out.println(arr);
        }

    }

    public  Product searchProduct(String path) {
        List<Product> list = readFile(path);
        System.out.println("Enter id produc search");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product arr : list) {
            if (arr.getId() == id) {
                return arr;
            }
        }
        return null;


    }


}
