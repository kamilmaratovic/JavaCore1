package lesson8_Classes_Fields_Methods;

public class HomeWork {
    public static void main(String[] args) {

Cat barsik = new Cat();
barsik.name = "Barsik";
barsik.breed = "Scotland";
barsik.color = "Gray/Silver";
barsik.gender= "Male";
barsik.year = 2020;

Cat muska = new Cat();
muska.name = "Muska";
muska.breed = "Mix";
muska.color = "3 mixed colors";
muska.gender = "Female";
muska.year = 1995;

barsik.catNewParents("MiKaelsons", 4500.0);
muska.catNewParents("Petrovs", 2350.0);

Dog bobby = new Dog();
bobby.name = "Bobby";
bobby.year = 2013;
bobby.color = "Brown/Black";
bobby.gender = "Male";
bobby.breed = "Blood Hound";
bobby.size = "Extra Large";


Dog suzan = new Dog();
suzan.name = "Suzan";
suzan.breed = "Husky";
suzan.size = "Large";
suzan.gender= "Female";
suzan.year = 2010;
suzan.color = "White/Gray";

bobby.adaptationNotes(2019, "Johnsons", "New York");
suzan.adaptationNotes(2016, "Williams", "LA");
    }
}
