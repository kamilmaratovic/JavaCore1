package lesson12_Composition_ReferenceVsPrimitive_Polymorphism;


public class App {
    public static void main(String[] args) {

        Address annaAddress = new Address("731 Kathleen Pl", "Brooklyn",State.NY, 11235);
        String name = "Anna";
        String lastName = "Smith";
        Person anna = new Person(name, lastName, annaAddress);

        //or  Person anna = new Person("Anna", "Smith", new Address ("731 Kathleen Pl", "Brooklyn",State.NY, 11235));

        String streetName = anna.getAddress().getStreenName();
        System.out.println(streetName);
        String city = anna.getAddress().getCity();
        System.out.println(city);

        State state = anna.getAddress().getState();
        System.out.println(state);
    }
}
