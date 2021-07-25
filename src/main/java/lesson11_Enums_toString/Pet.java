package lesson11_Enums_toString;

public class Pet {
    protected String name;
    protected String breed;
    protected String color;
    protected double age;

    public Pet (String name, String breed, String color, double age){
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public String getColor(){
        return color;
    }
    public double getAge(){
        return age;
    }

    public void setName (String name){
        this.name = name;
    }
    public void setBreed (String breed){
        this.breed = breed;
    }
    public void setColor (String color){
        this.color = color;
    }
    public void setAge (double age){
        this.age = age;
    }
}


