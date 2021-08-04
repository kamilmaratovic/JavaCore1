package lesson16_HomeWork;

public class Person {
   private String name;
   private String lastName;
   private int year;

    public Person(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Person info: \n" +
                "Name is " + name + "\n" +
                "Last name is " + lastName + "\n" +
                "YOB is " + year+"\n";
    }
}
