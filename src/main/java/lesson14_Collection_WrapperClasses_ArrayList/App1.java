package lesson14_Collection_WrapperClasses_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Color");
        list.add("Pencil");
        list.add("Cow");
        System.out.println(list);
        list.add("Car");
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(2, "Cup");
        System.out.println(list);
        list.add(1, "Rainbow");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(list.size()-1));
        list.add("Pencil");
        System.out.println(list);
        boolean b = list.remove("Pencil");
        System.out.println(b);
       boolean a= list.remove("Shoes");
        System.out.println(a);
        String xx = list.remove(1);
        System.out.println(xx);
        b = list.contains("Car");
        System.out.println(b);

      //Iterate Lists (3 ways)
        for(String ss : list){
            System.out.println(ss);

            }

        list.forEach(ss-> System.out.println(ss));
        list.forEach(System.out::println);
        }



        //add(value) - adding values to the end of ArrayList;
        //get(index) - return element with index;


    }

