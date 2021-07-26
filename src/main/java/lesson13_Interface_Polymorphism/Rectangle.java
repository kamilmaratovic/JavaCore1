package lesson13_Interface_Polymorphism;

public class Rectangle implements Shape{
    protected double lenght;
    protected double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("I draw a rectangle with a= "+lenght+" ,b= "+width);
    }

    @Override
    public double getPerimeter() {
        return (lenght+width)*2;
    }

    @Override
    public double getArea() {
        return width*lenght;
    }
}
