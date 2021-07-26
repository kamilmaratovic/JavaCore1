package lesson13_Interface_Polymorphism;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("I draw Circle with radius " + radius);
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
