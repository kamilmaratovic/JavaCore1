package lesson16_HomeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();

        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Lexus");
        cars.add("Skoda");

//        System.out.println(cars);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(0, 50);
        numbers.add(1, 100);
        numbers.add(2, 150);
        numbers.add(3, 200);
        numbers.add(4, 250);

//        System.out.println(numbers);
//
        List<Person> person = new ArrayList<>();

        Person kamil = new Person("Kamil", "Sukaev", 1985);
        Person kseniia = new Person("Kseniia", "Smykova", 1992);
        Person john = new Person("John", "Smith", 1927);
        Person steve1 = new Person("Steve", "Jobs", 1951);
        Person steve2 = new Person("Steve", "Voznyak", 1946);

        person.add(new Person("Kamil", "Sukaev", 1985));
        person.add(new Person("Kseniia", "Smykova", 1992));
        person.add(new Person("John", "Smith", 1927));
        person.add(new Person("Steve", "Jobs", 1951));
        person.add(new Person("Steve", "Voznyak", 1946));

//        for (int i = 0; i<1; i++){
//                if(steve1.getName().contains("Steve")){
//                    System.out.println(steve2.getLastName());
//
//                }
//            }

//        person.forEach(v-> System.out.println(steve1.getLastName().length()));


        Map<String, String> countries = new HashMap<String, String>();
        countries.put("London", "England");
        countries.put("Paris", "France");
        countries.put("Madrid", "Spain");
        countries.put("Berlin", "Germany");


        Map<Integer, String> office = new HashMap<>();
        office.put(209, "Dantist");
        office.put(120, "Surgeon");
        office.put(403, "ENT doctor");
        office.put(567, "Ophthalmologist");

//        System.out.println(office);

        Map<Person, Fruit> lovelyFruits = new HashMap<>();
        lovelyFruits.put(kamil, Fruit.BANANA);
        lovelyFruits.put(kseniia, Fruit.MANGO);
        lovelyFruits.put(steve1, Fruit.APPLE);
        lovelyFruits.put(steve2, Fruit.PINEAPPLE);
//
//        System.out.println(lovelyFruits);
//        lovelyFruits.remove(steve1);
//        System.out.println("____________________");
//        System.out.println(lovelyFruits);

        //Hospitals

        //Doctors
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Lesli", "Nielsen", Position.ENT));
        doctors.add(new Doctor("Kamil", "Sukaev", Position.DENTIST));
        doctors.add(new Doctor("Kseniia", "Smykova", Position.PHYSICIAN));
        doctors.add(new Doctor("John", "Stuart", Position.SURGEON));
        doctors.add(new Doctor("William", "Wachowski", Position.OPHTHALMOLOGIST));

//        for (Doctor v: doctors){
//            v.printDoctorInfo();
//        }

        doctors.forEach(System.out::println);

        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(22, "Surgery");
        rooms.put(33, "Physician");
        rooms.put(44, "Dentist");
        rooms.put(55, "ENT");
        rooms.put(66, "Ophthalmologist");

//        for (Map.Entry<Integer, String> entry : rooms.entrySet()){
//            System.out.println("Office# "+entry.getKey()+" '"+entry.getValue()+"'");
//        }
//
//        for (Integer name: rooms.keySet()) {
//            String key = name.toString();
//            String value = rooms.get(name).toString();
//            System.out.println(key + " " + value);
//        }

        rooms.forEach((Integer, String)-> System.out.println(Integer+" "+String));



        List<InsuranseCompamies>  acceptedInsurances= new ArrayList<>();
        acceptedInsurances.add(InsuranseCompamies.FIDELIS);
        acceptedInsurances.add(InsuranseCompamies.METRO);
        acceptedInsurances.add(InsuranseCompamies.HEALTH_FIRST);

        Hospital marmadis = new Hospital("Marmadis", new Address("731 Kathleen pl", "Brooklyn", "NY", 11235), doctors, rooms, acceptedInsurances);

        System.out.println(marmadis.toString());

        }
    }


//Task 1:

//Create 3 ArrayList - String, Integer and some Custom class
//Add 4+ elements to each List excersize methods add/set/remove/get/foreach and etc

//Task 2:

//Create 3 HashMap- <String,String>, <Integer,String> and custom classes <Class1,Class2>
//add 4 elements to each hashmap try methods  put/replace/remove/get/foreach

//Task 3:

//Create class Hospital
//Fields
//- private String hospitalName;
//- privare Address address;
//    (Class Address
//    - private String streetAddress;
//    - private String town;
//    - private String state;
//    - private int zip;
//- private List<Doctor> doctors;
//    (Class Doctor
//    - private String name;
//    - private String lastName;
//    - private Position position;
//    (Enum Title is a enum with 5 members - for example Position.PHYSICIAN);
//- private HashMap<Integer,String> rooms; (list of rooms and their names - for example room 22 - Gastroenterology rooms.put(22,"Gastroenterology") )
//- private ArrayList<InsuranseCompamies> acceptedInsuranses; list of accepted insurance.
//    (Enum InsuranseCompamies - enum of Insuranses,  for example InsuranseCompamies.AETNA, InsuranseCompamies.UnitedHealthcare)
//Methods:
//- Printout hospital with ALL fields
//- Printout Doctors and their titles; public void printDoctors();
//- Printout rooms
