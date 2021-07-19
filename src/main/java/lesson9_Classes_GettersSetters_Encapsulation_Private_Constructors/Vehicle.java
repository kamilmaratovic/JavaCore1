package lesson9_Classes_GettersSetters_Encapsulation_Private_Constructors;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }
    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }
}
