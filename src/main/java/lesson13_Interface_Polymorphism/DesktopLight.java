package lesson13_Interface_Polymorphism;

public class DesktopLight implements AmericanPowerPlug, E27Buld{
   private String color;
   private int price;
   public void americanPowerPlug() {
        System.out.println("Plug is implemented");
    }
    public void useE27Bulb() {
        System.out.println("We are using E27 bulb");
    }
}
