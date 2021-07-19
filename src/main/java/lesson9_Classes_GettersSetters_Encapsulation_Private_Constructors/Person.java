package lesson9_Classes_GettersSetters_Encapsulation_Private_Constructors;

import java.util.Calendar;

public class Person {

    private String name;
    private String lastName;
    private int year;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setLastName(String ln){
        lastName = ln;
    }

    public String getLastName(){
        return lastName;
    }

    public void setYear (int y){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        year = y;
        if(year>currentYear || year<1890){
            throw new IllegalArgumentException("Wrong age");
        }
    }

    public int getYear(){
        return year;
    }

    public Person (String name, String lastName, int year){
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }

    public Person(){}

    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public void printInfo(){
        System.out.println(name+" "+lastName+" "+year);
    }
}
