package lesson12_Composition_ReferenceVsPrimitive_Polymorphism;

public class Person1 {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person1(String name) {
        this.name = name;
    }
}
