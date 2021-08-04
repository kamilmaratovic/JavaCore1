package lesson14_Collection_WrapperClasses_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    //1. When we create an ArrayList it's always empty
    //2. We can't use primitive types in ArrayLists

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(5);
        numbers.add(-4);

        System.out.println(numbers);
    }
}
