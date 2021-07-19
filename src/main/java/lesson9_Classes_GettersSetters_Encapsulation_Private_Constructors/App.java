package lesson9_Classes_GettersSetters_Encapsulation_Private_Constructors;

public class App {
    public static void main(String[] args) {

        Person helen = new Person();
        helen.setName("Helen");
        helen.setLastName("Lee");
        helen.setYear(2001);

        String xx= helen.getName();
        System.out.println(xx);

        Person peter = new Person("Peter", "Johnson", 1967);
        System.out.println(peter.getLastName());

        Person david = new Person("David", "Lebowski");



    }

    //Encapsulation allow us to limit information (its about public and private classes and setters-getters)

}
