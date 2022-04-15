package _11_stack_queue.exercise.queue;

import java.util.Comparator;

public class Person {
    private String name;
    private boolean gender;
    private int birthday;

    public Person() {
    }

    public Person(String name, boolean gender, int birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                " gender= " + gender +
                " birthday= " + birthday +
                '}';
    }

}