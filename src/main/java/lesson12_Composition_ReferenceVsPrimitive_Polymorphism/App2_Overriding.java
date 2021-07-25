package lesson12_Composition_ReferenceVsPrimitive_Polymorphism;

public class App2_Overriding {
    public static void main(String[] args) {
        Person1 david = new Person1("David");
        System.out.println(david.getName());

        Person1 anna= new Student("Anna", "Math");
        System.out.println(anna.getName());

        Person1 jane = new Person1("Jane");
        Person1 mary = new Student("Mary", "History");
        Student jake = new Student("Jake", "CS");

        Person1[] people = {david, anna, jane, mary, jake};

        for (Person1 v : people){
            System.out.println(v.getName());
        }



    }
}
