package lesson11_Enums_toString;

public class Bird extends Pet {
    private String species;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Bird(String name, String breed, String color, double age, String species) {
        super(name, breed, color, age);
        this.species = species;
    }
}
