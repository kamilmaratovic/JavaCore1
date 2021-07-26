package lesson13_Interface_Polymorphism;

public class App {
    public static void main(String[] args) {
        String str = "Hi";
        System.out.println(str.length());
        System.out.println(str.charAt(1));

        DesktopLight xx = new DesktopLight();
        LaserPrinter printer = new LaserPrinter();
        xx.americanPowerPlug();
        xx.useE27Bulb();

        AmericanPowerPlug device1 = new DesktopLight();
        AmericanPowerPlug device2 = new LaserPrinter();

        AmericanPowerPlug[] devices = {xx, printer, device1, device2};

        for (AmericanPowerPlug v : devices){
            v.americanPowerPlug();
        }

        //Polimorphism: depends on what object inside interface or parent class it will action in a different way;

    }
}
