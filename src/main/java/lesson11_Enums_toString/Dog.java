package lesson11_Enums_toString;

public class Dog extends Pet{
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Dog(String name, String breed, String color, double age, String size) {
        super(name, breed, color, age);
        this.size = size;
    }
}
