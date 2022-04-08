package _07_abstract_interface.practice.animal_interface_edible;

public abstract class Animal {
    public abstract String makeSound();
}
 class Tiger extends Animal{
    @Override
    public String makeSound() {
        return "gưuuuuuuuu" ;
    }
}
class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "chíp chíp";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}

