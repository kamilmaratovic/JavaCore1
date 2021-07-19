package lesson8_Classes_Fields_Methods;

public class Car {
    public String brand;
    public String model;
    public  String color;
    public int year;

    public void startEngine(){
        System.out.println("Engine of "+brand+" "+model+" is started");
    }

    public void stopCar (){
        System.out.println(brand+" "+model+" has stoped");
    }
}
