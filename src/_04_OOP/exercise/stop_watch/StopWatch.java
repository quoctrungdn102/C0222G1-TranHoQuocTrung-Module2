package _04_OOP.exercise.stop_watch;

public class StopWatch {

    private long startTime, endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
//        this.endTime = System.currentTimeMillis();
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }


    public long start() {
        return this.startTime;
    }

    public long sTop() {
        return System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return (this.sTop() - this.startTime);
    }




    public static void main(String[] args) {

    }
}
//989
//9