package lesson13_Interface_Polymorphism;

public class Square extends Rectangle {
    public Square(double lenght) {
        super(lenght, lenght);
    }
    @Override
    public void draw (){
        System.out.println("I draw a square with side= "+lenght);
    }
}
