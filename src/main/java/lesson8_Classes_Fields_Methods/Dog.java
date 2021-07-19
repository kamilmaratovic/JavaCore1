package lesson8_Classes_Fields_Methods;

public class Dog {
    String name;
    String gender;
    String color;
    String breed;
    String size;
    int year;

    public void adaptationNotes (int adoptYear, String family, String city){
        System.out.println("The dog named "+name+", breed "+breed+" (gender: "+gender+", color: "+color+", YOB: "+year+")"+" was adopted in "+adoptYear+" by family of "+family+" and now living in "+city);
    }
}
