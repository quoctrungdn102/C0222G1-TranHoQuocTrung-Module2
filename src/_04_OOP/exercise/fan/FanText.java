package _04_OOP.exercise.fan;

import _04_OOP.exercise.fan.Fan;

public class FanText {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"yellow");
        Fan fan2 = new Fan(1,false,5,"blue");
        System.out.println(fan1);
        System.out.println(fan2);
        fan2.setOn(true);
        System.out.println(fan2);
        Fan fan3 = new Fan();
        System.out.println(fan3);
    }
}
