package _15_exception.exercise;

public class Triangle {
    private int edge1;
    private int edge2;
    private int edge3;

    public Triangle(int triangleEdge1, int triangleEdge2, int triangleEdge3) throws IllegalTriangleException {
        this.edge1 = triangleEdge1;
        this.edge2 = triangleEdge2;
        this.edge3 = triangleEdge3;
        if (this.edge1 < 0
                || this.edge2 < 0
                || this.edge3 < 0) {
            throw new IllegalTriangleException("cạnh không được âm  ");
        }


        if (((this.edge1 + this.edge2) <= this.edge3)
                || ((this.edge1 + this.edge3) <= this.edge2)
                || ((this.edge2 + this.edge3) <= this.edge1)) {
            throw new IllegalTriangleException("tổng 2 cạch phải lớn hơn cạnh còn lại");
        }


    }

    public int getEdge1() {
        return edge1;
    }

    public void setEdge1(int edge1) {
        this.edge1 = edge1;
    }

    public int getEdge2() {
        return edge2;
    }

    public void setEdge2(int edge2) {
        this.edge2 = edge2;
    }

    public int getEdge3() {
        return edge3;
    }

    public void setEdge3(int edge3) {
        this.edge3 = edge3;
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
