package lesson12_HomeWork_PC;

public class Display {
    private String brand;
    private String model;
    private int size;

    public Display(String brand, String model, int size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
