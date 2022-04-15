package _11_stack_queue.exercise.queue;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Queue<Person> nam = new LinkedList<>();
        Queue<Person> nu = new LinkedList<>();
        List<Person> list = new ArrayList<>();
        Person person = new Person("nam", true, 21);
        Person person1 = new Person("nu1", false, 23);
        Person person2 = new Person("nam", true, 20);
        Person person3 = new Person("nu2", false, 25);
        Person person4 = new Person("nam", true, 26);
        list.add(person);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        Collections.sort(list,new PersonComparator());


        for (Person value : list) {
            if (value.isGender()) {
                nu.add(value);

            } else {
                nam.add(value);
            }
        }

        for (Person arr : nam) {
            System.out.println(arr);
        }

        System.out.println(" ");
        for (Person arr : nu) {
            System.out.println(arr);
        }

    }

}
