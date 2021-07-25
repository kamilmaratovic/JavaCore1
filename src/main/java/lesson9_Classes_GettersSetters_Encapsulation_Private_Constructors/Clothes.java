package lesson9_Classes_GettersSetters_Encapsulation_Private_Constructors;

public class Clothes {
    private double size;
    private String brand;
    private String season;
    private String type;
    private double price;

    public Clothes (){}

    public Clothes (String brand, String season, String type, double size, double price){
        this.brand = brand;
        this.price = price;
        this.season = season;
        this.type = type;
        this.size = size;
    }

    public String getBrand(){
        return brand;
    }

    public double getPrice(){
        return price;
    }

    public double getSize(){
        return size;
    }

    public String getSeason(){
        return season;
    }

    public String getType(){
        return type;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void printInfo() {
        System.out.println("Clothes{" +
                "size=" + size +
                ", brand='" + brand + '\'' +
                ", season='" + season + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}');
    }
}
