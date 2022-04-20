package _15_exception.exercise;

import _15_exception.exercise.IllegalTriangleException;

public class Triangle {
    private int Edge1;
    private int Edge2;
    private int Edge3;

    public Triangle(int triangleEdge1, int triangleEdge2, int triangleEdge3) throws IllegalTriangleException {
        this.Edge1 = triangleEdge1;
        this.Edge2 = triangleEdge2;
        this.Edge3 = triangleEdge3;
        if (this.Edge1 < 0
                || this.Edge2 < 0
                || this.Edge3 < 0) {
            throw new IllegalTriangleException("cạnh không được âm  ");
        }


        if (((this.Edge1 + this.Edge2) <= this.Edge3)
                || ((this.Edge1 + this.Edge3) <= this.Edge2)
                || ((this.Edge2 + this.Edge3) <= this.Edge1)) {
            throw new IllegalTriangleException("tổng 2 cạch phải lớn hơn cạnh còn lại");
        }


    }

    public int getEdge1() {
        return Edge1;
    }

    public void setEdge1(int edge1) {
        this.Edge1 = edge1;
    }

    public int getEdge2() {
        return Edge2;
    }

    public void setEdge2(int edge2) {
        this.Edge2 = edge2;
    }

    public int getEdge3() {
        return Edge3;
    }

    public void setEdge3(int edge3) {
        this.Edge3 = edge3;
    }

    public Triangle() {
    }

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap cạnh thứ nhất");
//        int triangleEdge1 = scanner.nextInt();
//        System.out.println("nhap cạnh thứ hai");
//        int triangleEdge2 = scanner.nextInt();
//        System.out.println("nhap cạnh thứ ba");
//        int triangleEdge3 = scanner.nextInt();
//
//       try {
//
//
//
//       }
//       catch (IllegalTriangleException e){
//
//       }

}
