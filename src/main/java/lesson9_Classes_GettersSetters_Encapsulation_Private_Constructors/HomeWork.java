package lesson9_Classes_GettersSetters_Encapsulation_Private_Constructors;

public class HomeWork {
    public static void main(String[] args) {

     Cellphone iPhone = new Cellphone("Apple", 12, "iPhone 12", 6.5,  1000.0);
     Cellphone samsung = new Cellphone("Samsung", 20, "Galaxy S20", 7, 1150.0);
     Cellphone samsungOld = new Cellphone();
     samsungOld.setBrand("Samsung");
     samsungOld.setModel("Galaxy S9");
     samsungOld.setDisplaySize(5.5);
     samsungOld.setCamera(12);
     samsungOld.setPrice(850.00);

     iPhone.mediumMarketPrice();
     iPhone.printInfo();
     samsung.mediumMarketPrice();
     samsung.printInfo();
     samsungOld.printInfo();

     Clothes boots = new Clothes();
     boots.setBrand("Nike");
     boots.setSeason("demi");
     boots.setSize(9.5);
     boots.setType("Boots");
     boots.setPrice(550.00);

     boots.printInfo();

     Clothes shirt = new Clothes("Banana Republic", "Spring/Summer", "Shirt", 42, 430);
     shirt.printInfo();

    }



}


//1. Create 4 classes with fields (at least 3 fields) and methods (at least 1 method)
//        each class has at least 2 constructors (default and full)
//        create printClass()/ printInfo() method to print out all fields
//        fields are private
//each field has getter and setter
//        2. In the App class create main() and create 2 instanses of each class;
//one instance created used default constructor - fill up fields using setter
//        second object created using full constructor
//        print object info using print-out method