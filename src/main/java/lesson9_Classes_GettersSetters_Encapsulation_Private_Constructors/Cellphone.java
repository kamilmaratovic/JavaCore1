package lesson9_Classes_GettersSetters_Encapsulation_Private_Constructors;

public class Cellphone {
  private String brand;
  private int camera;
   private String model;
   private double displaySize;
   private double price;

   public Cellphone (){}

   public Cellphone (String brand, int camera, String model, double displaySize, double price){
       this.brand = brand;
       this.camera = camera;
       this.model = model;
       this.displaySize = displaySize;
       this.price = price;
   }
    public String getBrand (){
       return brand;
    }
    public int getCamera(){
       return camera;
    }
    public String getModel(){
       return model;
    }
    public double getDisplaySize(){
       return displaySize;
    }
    public double getPrice(){
       return price;
    }

    public void setBrand(String brand){
       this.brand = brand;
    }

    public void setModel (String model){
       this.model = model;
    }

    public void setCamera (int camera){
       this.camera = camera;
    }

    public void setDisplaySize (double displaySize){
       this.displaySize = displaySize;
    }

    public void setPrice (double price){
       this.price = price;
    }


    public void printInfo() {
        System.out.println("***Cellphone***" +
                "\nBrand is " + brand +
                "\nCamera is " + camera + "Mp"+
                "\nModel is " + model +
                "\nDisplay Size is " + displaySize + " in"+
                "\nprice is $" + price+"\n______________________");
    }

    public void mediumMarketPrice (){
        System.out.println("Medium price on this " +model+" on the market is $"+price+"\n____________________");

    }
}
