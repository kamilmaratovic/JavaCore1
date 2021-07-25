package lesson10_11_Inheritance_Super_NameConventions;

public class Teacher extends Person {
    protected String subject;


    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public Teacher(String name, String lastName, int yearOfBirth, String subject) {
     super(name, lastName, yearOfBirth);
        this.subject = subject;
    }
}
