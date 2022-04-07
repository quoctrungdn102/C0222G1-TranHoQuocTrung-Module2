package _06_inheritance.exercise.point_va_moveable_point;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySeed = ySeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySeed() {
        return ySeed;
    }

    public void setySeed(float ySeed) {
        this.ySeed = ySeed;
    }

    public void setSpeed(float xSpeed, float ySeed) {
        this.xSpeed = xSpeed;
        this.ySeed = ySeed;
    }

    public float[] getSpeed() {
        float[] arr = new float[2];
        return arr;
    }

    @Override
    public String toString() {
        return super.toString() ;
    }

    public MoveablePoint move() {
       super.setX(getX()+getxSpeed());
       super.setY(getY()+getySeed());
       return this;
    }
}
