package _05_access_modifi.practice;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");


        System.out.println(Car.numberOfCars);
        System.out.println(car1);
        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCars);
        System.out.println(car2);
    }
    public static class Car {

        private String name;

        private String engine;



        public static int numberOfCars;



        public Car(String name, String engine) {

            this.name = name;

            this.engine = engine;
            numberOfCars++;

        }
        public  String toString(){
            return this.name +" "+this.engine ;
        }



        // getters and setters

    }

}
