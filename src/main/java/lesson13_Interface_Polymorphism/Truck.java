package lesson13_Interface_Polymorphism;

public class Truck implements Vehicle{
   private int numberOfWheels;
   private VehicleType type;
   private double maxSpeed;

    public Truck(int numberOfWheels, VehicleType type, double maxSpeed) {
        this.numberOfWheels = numberOfWheels;
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("This truck can move with a speed of "+maxSpeed);
    }

    @Override
    public int wheels() {
        return numberOfWheels;
    }

    @Override
    public VehicleType type() {
        return type;
    }
}
