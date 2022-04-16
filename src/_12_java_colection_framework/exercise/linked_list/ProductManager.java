package _12_java_colection_framework.exercise.linked_list;






import java.util.*;


public class ProductManager {
  Scanner scanner1 = new Scanner(System.in);

//    static List<Product> list = new ArrayList<>();

    public ProductManager() {
    }

    public void showList(List<Product> list) {
        for (Product arr : list) {
            System.out.println(arr);
        }
    }

    public void addProduct(List<Product> list) {

        System.out.println("nhap loai thuoc ");
        String name = scanner1.nextLine();
        System.out.println("nhap gia ");
        double gia = Double.parseDouble(scanner1.nextLine());
        Product product = new Product(name, gia);

        list.add(product);


    }

    public void editById(LinkedList<Product> list) {
        System.out.println("nhap san pham thay doi");
        String name = scanner1.nextLine();
        for (Product temp : list) {
            if (temp.getName().equals(name)) {
                System.out.println("nhap san pham moi");
                temp.setName(scanner1.nextLine());
                System.out.println("nhap gia moi");
                temp.setGia(Double.parseDouble(scanner1.nextLine()));
            } else {
                break;
            }
        }
    }
    public void removeProduct(LinkedList<Product>list){
        System.out.println("nhap san pham ban muon xoa ");
        String index =scanner1.nextLine();
        for (Product arr1: list) {
            if (arr1.getName().equals(index)){
                list.remove();
            }
        }
        showList(list);
    }
    public void search(LinkedList<Product>list){
        System.out.println("nhap san phan muon tim kiem ");
        String index = scanner1.nextLine();
        for (Product arr:list) {
            if(arr.getName().equals(index)){
                System.out.println(arr);
            }

        }
    }
    public  void sort(LinkedList<Product>list){
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getGia()-o2.getGia());
            }
        });
//        Collections.sort(list);
//        showList(list);
    }
}
