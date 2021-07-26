package lesson13_Interface_Polymorphism;

public class App1 {
    public static void main(String[] args) {

        Circle cr1 = new Circle(2.2);
        Shape shape1 = new Circle(2.3);
        Rectangle rec1 = new Rectangle(2, 3.1);
        Square sq1 = new Square(5);
        Rectangle sq2 = new Square(2.4);
        Shape shape2 = new Square(4.1);

        Shape [] shapes= {cr1, shape1, rec1, sq1, sq2, shape2};
        for(Shape v : shapes){
            v.draw();
            System.out.println("Area of the shape is "+v.getArea());
            System.out.println("Perimeter of the shape is "+v.getPerimeter()+"\n");
        }
    }
}
