package lesson13_Interface_Polymorphism;

public class HomeWork {

    public static void main(String[] args) {



    Vehicle toyota = new Car(4, VehicleType.CAR, 150);
    Car bmw = new Car(4, VehicleType.CAR, 185);
    Vehicle mercedesTruck = new Truck(6, VehicleType.TRUCK, 100);
    Truck ramTruck = new Truck(8, VehicleType.TRUCK, 110);

    Vehicle[] vehicles = {toyota, bmw, mercedesTruck, ramTruck};

    for(Vehicle v :vehicles) {
        v.move();
        System.out.println("Type of the vehicle is "+v.type());
        System.out.println("This vehicle has "+v.wheels()+" wheels\n");

    }

}

//    Create an interface and 2 classes which implements it
//    Create 2 objects of each class
//    Assign one object to interface type
}
