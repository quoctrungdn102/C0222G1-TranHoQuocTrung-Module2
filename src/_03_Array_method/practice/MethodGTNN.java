package _03_Array_method.practice;

public class MethodGTNN {
    public static void main(String[] args) {
        int[] arr1 = {9, 5,1, 6, 8, 9, 6};
        int index = minValue(arr1);
//        System.out.println(Arrays.stream(arr1).max().getAsInt());
        System.out.println("min= "+arr1[index] +"\nvi tri tai "+ index);
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        int index=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
