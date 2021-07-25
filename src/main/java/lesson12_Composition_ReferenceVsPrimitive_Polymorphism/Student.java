package lesson12_Composition_ReferenceVsPrimitive_Polymorphism;

public class Student extends Person1{
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getName (){
        return "Student name is "+ super.name;
    }
}
