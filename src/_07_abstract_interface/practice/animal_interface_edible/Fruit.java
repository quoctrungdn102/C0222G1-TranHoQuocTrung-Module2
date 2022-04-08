package _07_abstract_interface.practice.animal_interface_edible;

public abstract class  Fruit implements Edible {

}
class Orange extends Fruit{

    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}
class Apple extends Fruit{

    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}