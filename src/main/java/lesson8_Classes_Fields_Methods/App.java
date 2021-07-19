package lesson8_Classes_Fields_Methods;

public class App {
    public static void main(String[] args) {

        Person mary = new Person();
        mary.name = "Mary";
        mary.lastname = "Hudson";
        mary.age = 25;

        Person jake = new Person();
        jake.name = "Jake";
        jake.lastname = "Dobson";
        jake.age = 18;

        Person steve = new Person();
        steve.age = 26;
        steve.name = "Steve";
        steve.lastname = "Peters";
        steve.gender = "male";

        printPerson(mary);

        printPerson(jake);

        printPerson(steve);

        Vehicle myCar = new Vehicle();
        myCar.brand = "Toyota";
        myCar.model = "Prius";
        myCar.color = "Pink";
        myCar.year = 1989;

        Vehicle myFriendsCar = new Vehicle();
        myFriendsCar.color = "Yellow";
        myFriendsCar.brand = "Honda";

    }

    public static void printPerson(Person person){
        System.out.println("Name of the person is "+person.name+"\nLast name of the person is "+person.lastname+ "\nand age of the person is "+person.age+" years\n");
    }



}
