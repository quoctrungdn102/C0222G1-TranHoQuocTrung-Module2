package _04_OOP.exercise.stop_watch;

public class StopWatchText {
    public static void main(String[] args) {
        int[] arr = new int[100000];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor((Math.random() * 99.0) + 1.0);
        }

        StopWatch stopWatch = new StopWatch();


//        long start = stopWatch.start();

        stopWatch.start();
        sort(arr);
        stopWatch.sTop();

//        long stop = stopWatch.sTop();
//        System.out.println( stop -start);

        System.out.println(stopWatch.getElapsedTime());
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }


        }
    }

}
