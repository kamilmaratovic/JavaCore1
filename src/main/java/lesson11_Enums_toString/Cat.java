package lesson11_Enums_toString;

public class Cat extends Pet{
    private String vaccines;

    public String getVaccines() {
        return vaccines;
    }

    public void setVaccines(String vaccines) {
        this.vaccines = vaccines;
    }

    public Cat(String name, String breed, String color, double age, String vaccines) {
        super(name, breed, color, age);
        this.vaccines = vaccines;
    }
}
