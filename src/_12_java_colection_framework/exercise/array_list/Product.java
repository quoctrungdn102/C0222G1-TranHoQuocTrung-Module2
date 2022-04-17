package _12_java_colection_framework.exercise.array_list;

import c_r_u_d.add_ex.Student;

public class Product implements Comparable<Product> {
    private String name;
    private double gia;

    public Product() {
    }

    public Product(String name, double gia) {
        this.name = name;
        this.gia = gia;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" +
                name +
                "// gia = " + gia + "vnd" +
                '}';
    }


    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.getName());
    }
}
