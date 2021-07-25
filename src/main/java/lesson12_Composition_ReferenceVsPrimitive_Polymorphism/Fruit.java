package lesson12_Composition_ReferenceVsPrimitive_Polymorphism;

public class Fruit {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fruit(String name) {
        this.name = name;
    }
}
