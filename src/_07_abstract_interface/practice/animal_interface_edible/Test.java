package _07_abstract_interface.practice.animal_interface_edible;

public class Test  {
    public static void main(String[] args) {
        Animal[]arr=new Animal[2];
        arr[0]= new Tiger();
        arr[1]=new Chicken();
        for (Animal x : arr) {
            System.out.println(x.makeSound());

        }
        Apple apple = new Apple();
        System.out.println(apple.howToEat());

    }


}
