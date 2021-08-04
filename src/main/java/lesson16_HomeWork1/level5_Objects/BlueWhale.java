package lesson16_HomeWork1.level5_Objects;

import lesson16_HomeWork1.level4_Mammals.Whales;

public class BlueWhale extends Whales {


    public BlueWhale(String name, int legsNumber, String feedType, int lifeSpan) {
        super(name, legsNumber, feedType, lifeSpan);
    }

    @Override
    public void itIsALife() {
        System.out.println("It's a form of life and its big");
    }

    @Override
    public void itCanBreathe() {
        System.out.println("It can breath with its lungs");
    }

    @Override
    public int legsNumber() {
        return legsNumber;
    }

    @Override
    public void tail() {
        System.out.println("It has a huge tail");

    }

    @Override
    public void itCanMove() {
        System.out.println("It swims in water");
    }

    @Override
    public void makeSounds() {
        System.out.println("It makes ultra sounds");
    }

    @Override
    public int lifespan() {
        return lifeSpan;
    }

    @Override
    public void itCanBePregnant() {
        System.out.println("It can be pregnant with a live child and uses milk for feeding");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
