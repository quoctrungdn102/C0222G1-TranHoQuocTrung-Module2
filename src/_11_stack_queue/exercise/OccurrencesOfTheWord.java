package _11_stack_queue.exercise;

import javafx.scene.chart.Chart;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OccurrencesOfTheWord {
    public static void demTu (Map<String,Integer>map, String []arr ){

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int count = 0;

            for (int i = 0; i <arr.length; i++) {
                if(arr[i].equals(entry.getKey())){
                    count++;
                }
            }
            map.put(entry.getKey(),count);
            System.out.println(entry.getKey() + " xuất hiện : " + entry.getValue()+"lan");
        }
    }
 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nhap = scanner.nextLine();
        String []arr = nhap.toLowerCase().split(" ");
        Map<String,Integer>map = new TreeMap<>();
        for (int i = 0; i <arr.length; i++) {
           map.put(arr[i],0);
        }
        demTu(map,arr);
//        System.out.println(map);
    }

    }



