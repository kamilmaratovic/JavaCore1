package lesson8_Classes_Fields_Methods;

public class App2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Tundra";
        myCar.color = "Silver";
        myCar.year = 2011;

        myCar.startEngine();

        Car bb = new Car();
        bb.year = 1999;
        bb.brand = "BMW";
        bb.model = "X5";

        bb.startEngine();
        bb.stopCar();


    }
}
