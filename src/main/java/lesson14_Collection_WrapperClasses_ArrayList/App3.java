package lesson14_Collection_WrapperClasses_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<Colors> colors = new ArrayList<Colors>();
        colors.add(Colors.BLUE);
        colors.add(Colors.BLUE);
        colors.add(Colors.WHITE);
        colors.add(1, Colors.BLACK);
        colors.add(Colors.CRIMSON);
        colors.add(Colors.GREY);
        System.out.println(colors);

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Kamil", "Sukaev"));
        persons.add(new Person("Kseniia", "Smykova"));
        persons.add(new Person("Michael", "Jordon"));
        System.out.println(persons);


    }
}
