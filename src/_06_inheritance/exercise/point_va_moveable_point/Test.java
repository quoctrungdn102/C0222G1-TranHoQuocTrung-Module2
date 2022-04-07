package _06_inheritance.exercise.point_va_moveable_point;

public class Test {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint.move());
    }
}
