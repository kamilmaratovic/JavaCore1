package lesson13_Interface_Polymorphism;

public abstract class Person { //we can't create an object of abstract class. Person by yourself has no meaning, but Teachers, Students and so on have it.)
    protected String name;
    protected String lastName;
    public abstract String getPersonInfo();
}
