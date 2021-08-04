package lesson16_HomeWork1.level5_Objects;

import lesson16_HomeWork1.level4_Mammals.Herbivores;

public class Cow extends Herbivores {
    public Cow(String name, int legsNumber, String feedType, int lifeSpan) {
        super(name, legsNumber, feedType, lifeSpan);
    }

    @Override
    public void itIsALife() {
        System.out.println("It's a form of life and its funny and cute");
    }

    @Override
    public void itCanBreathe() {
        System.out.println("It can breathe with its funny rose nose");
    }

    @Override
    public int legsNumber() {
        return legsNumber;
    }

    @Override
    public void tail() {
        System.out.println("It has small and active tail");
    }

    @Override
    public void itCanMove() {
        System.out.println("It moves not so often and fast and mostly when looking for some feed");
    }

    @Override
    public void makeSounds() {
        System.out.println("It makes 'Muuuu' sound");
    }

    @Override
    public int lifespan() {
        return lifeSpan;
    }

    @Override
    public void itCanBePregnant() {
        System.out.println("It feeds her baby with her tasty milk");
    }
}
