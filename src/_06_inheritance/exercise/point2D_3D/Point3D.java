package _06_inheritance.exercise.point2D_3D;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = getZ();
        return arr;
    }

    @Override
    public String toString() {
        return "("+super.getX()+" "+super.getY()+" "+z+")";
    }
}
