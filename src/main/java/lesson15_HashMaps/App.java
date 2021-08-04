package lesson15_HashMaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App { //There is now order in HashMaps. HashMaps consist from Key and Value, and Key should be always unique. If we provide
    //stuff with the same Key its just replacing previous value.
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<String, String>();
        countries.put("China", "Asia");
        countries.put("Poland", "Europe");
        countries.put("France", "Europe");
        countries.put("Germany", "Europe");
        countries.put("USA", "North America");
        countries.put("Canada", "North America");
        countries.put("Canada", "North Pole");

        System.out.println(countries.get("Canada"));
        System.out.println(countries.get("France"));

        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(0, "Red");
        colors.put(1, "Green");
        colors.put(2, "Blue");
        colors.put(3, "Yellow");

        System.out.println(colors.get(2));

        countries.replace("Canada", "North America");
        System.out.println(countries);

        String xx = countries.remove("Poland");
        System.out.println(xx);

        boolean yy =countries.containsKey("Poland");
        System.out.println(yy);
        yy = countries.containsValue("Europe");
        System.out.println(yy);

        Map<Fruit, Person> favouriteFruit = new HashMap<>();
        favouriteFruit.put(new Fruit(), new Person());
        System.out.println();

        //Iterate Maps (3 ways)
        for (String key : countries.keySet()){
            System.out.println(key);
        }
        System.out.println(" ");

        for (String value : countries.values()){
            System.out.println(value);
        }

        for (Map.Entry<String, String> entry : countries.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }


}
