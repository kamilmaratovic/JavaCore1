package lesson11_Enums_toString;

public class Car {
   private String brand;
   private String model;
   private Colors color;
   private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String brand, String model, Colors color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }
}
