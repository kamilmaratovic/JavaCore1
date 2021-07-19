package lesson8_Classes_Fields_Methods;

public class Cat {
    String name;
    String gender;
    String color;
    String breed;
    int year;

    public void catNewParents (String x, double y){
        System.out.println("The cat named "+name +" (breed: "+breed+" ,year: "+year+")"+" was bought by family of "+x+ " for "+y+"$");
    }
}


