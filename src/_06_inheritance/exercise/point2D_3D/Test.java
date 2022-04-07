package _06_inheritance.exercise.point2D_3D;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1,2,3);
        System.out.println(point3D);
      point3D.setXY(2,5);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
