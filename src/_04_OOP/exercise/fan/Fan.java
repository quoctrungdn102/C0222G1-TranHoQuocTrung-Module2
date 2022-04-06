package _04_OOP.exercise.fan;

public class Fan {
    public static final int SLOW  =1;
    public static final int MEDIUM=2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;

    }

    public void setSpeed(int speed) {
        if (speed == 1) {
            this.speed = SLOW;
        }else if (speed==2){
            this.speed=MEDIUM;
        }else if (speed==3){
            this.speed=FAST;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public Fan(int speed,boolean on,double radius,String color){
        this.speed=speed;
        this.on = on;
        this.radius=radius;
        this.color = color;
    }

    public String toString(){
        if(this.isOn()){
            return "speed: "+this.speed +" color: " + this.color+" radius: "+ this.radius + " fan is on";
        }else {
            return " color: " + this.color+" radius: "+ this.radius  + " fan is off";
        }

    }

}
