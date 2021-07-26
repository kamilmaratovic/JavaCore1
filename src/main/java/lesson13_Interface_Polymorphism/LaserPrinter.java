package lesson13_Interface_Polymorphism;

public class LaserPrinter implements AmericanPowerPlug{

    @Override
    public void americanPowerPlug() {
        System.out.println("++++++++++++US POWER PLUG+++++++++++++++++");
    }
}
