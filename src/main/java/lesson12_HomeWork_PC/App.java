package lesson12_HomeWork_PC;

public class App {
    public static void main(String[] args) {

        Processor intel = new Processor("Intel", "Core i9");
        RAM ram = new RAM(64);
        VideoCard nVidia = new VideoCard("RTX3090", "Nvidia");
        Keybord steelSeries = new Keybord("SteelSeries", "MAX", "Mechanical");
        Mouse razer = new Mouse("Razer", "N90");
        Disk seagate = new Disk(1000, "SSD");
        Display asus = new Display("Asus", "MX450", 34);

        MotherBoard myMotherBoard = new MotherBoard("Enigma", "MSI", intel, nVidia, ram);
        SystemBlock mySystemBlock = new SystemBlock(myMotherBoard, seagate);
        Computer myComputer = new Computer(steelSeries, razer, asus, mySystemBlock);
        System.out.println(myComputer.getSystemBlock().getMotherBoard().getProcessor().toString());




    }
}
