package lesson16_HomeWork1;

import lesson16_HomeWork1.level0.Life;
import lesson16_HomeWork1.level3_Vertebrates.Mammals;
import lesson16_HomeWork1.level5_Objects.BlueWhale;
import lesson16_HomeWork1.level5_Objects.Cow;
import lesson16_HomeWork1.level5_Objects.Lion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        BlueWhale blueWhale = new BlueWhale("Blue Whale", 0, "Plancton", 80);
        Cow cow = new Cow("Cow", 4, "Grass", 20);
        Lion lion = new Lion("Lion", 4, "Meet", 20);

        Mammals[] lives = {blueWhale, cow, lion};

        for (Mammals v : lives){
            v.itIsALife();
            v.itCanBreathe();
            v.itCanBePregnant();
            v.makeSounds();
            v.itCanMove();
            v.tail();
            v.lifespan();
            System.out.println("It has "+v.legsNumber()+" legs\n");

        }
    }
}

//inerface - Life
//in Life
//interface - Fungi
//inrerface - Bacteria
//interface - Plants
//interface - Animals
//in Animals
//interface Vertebrates
//interface Invertebrates
//in Vertebrates
//interface Reptilies
//interface Fish
//interface Amphibians
//interface Birds
//interface Mammals
//in Mammals
//abstract class Carnivores
//abstract class Primates
//abstract class Seals
//abstract class Rodents
//abstract class Whales
//abstract class Herbivores
//in Carnivores
//class - Lion
//class - Wolf
//class - BlueWhale
