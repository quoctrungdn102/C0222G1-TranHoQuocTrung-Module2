package _11_stack_queue.exercise.queue;

import java.util.*;

public class ManagerPersonnel {
    public static void main(String[] args) {
        Queue<Personnel> nam = new LinkedList<>();
        Queue<Personnel> nu = new LinkedList<>();
        List<Personnel> list = new ArrayList<>();
        Personnel person = new Personnel("nam", true, 21);
        Personnel person1 = new Personnel("nu1", false, 23);
        Personnel person2 = new Personnel("nam", true, 20);
        Personnel person3 = new Personnel("nu2", false, 25);
        Personnel person4 = new Personnel("nam", true, 26);
        list.add(person);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        Collections.sort(list,new PersonnelComparator());


        for (Personnel value : list) {
            if (value.isGender()) {
                nu.add(value);

            } else {
                nam.add(value);
            }
        }

        for (Personnel arr : nam) {
            System.out.println(arr);
        }

        System.out.println(" ");
        for (Personnel arr : nu) {
            System.out.println(arr);
        }

    }

}
