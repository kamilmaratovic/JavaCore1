package lesson10_11_Inheritance_Super_NameConventions;

public class App {

    //Name convention:
    // - Classes (File names) starts with capital letters
    // - variables starts with lowercase letters (except String)
    // - functions starts with lowercase letters
    // - Final variable and Enums - capital letters ONLY
    // - Java use camelCase, not a snake_case

    public static void main(String[] args) {
Student anna = new Student("Anna", "Johnson", 1985, "Math", "Washington University");
        System.out.println(anna.lastName);

        Person kamzik = new Person();
        kamzik.setName("Kamzik");
        kamzik.setLastName("Sukaev");

        Teacher mrJohns = new Teacher("Alan", "Johns", 1960, "Math");

        TempTeacher msDoll = new TempTeacher("Lisa", "Doll", 1998, "History", "January");

        String str = new String("Hello!");

        //int, char, boolean, double, short, long, byte - are primitives

        Person xx = new TempTeacher ("Dana", "Seymur", 1999, "Poetry", "June");

    }

}
