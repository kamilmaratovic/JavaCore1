package lesson16_HomeWork1.level5_Objects;

import lesson16_HomeWork1.level4_Mammals.Carnivores;

public class Lion extends Carnivores {

    public Lion(String name, int legsNumber, String feedType, int lifeSpan) {
        super(name, legsNumber, feedType, lifeSpan);
    }

    @Override
    public void itIsALife() {
        System.out.println("It's a life form and it's noble creature");
    }

    @Override
    public void itCanBreathe() {
        System.out.println("While it hunts it breath very deep and loud but when it relaxed it breath quiet");
    }

    @Override
    public int legsNumber() {
        return legsNumber;
    }

    @Override
    public void tail() {
        System.out.println("It has a big beautiful tail");
    }

    @Override
    public void itCanMove() {
        System.out.println("It moves very fast and cleverly");
    }

    @Override
    public void makeSounds() {
        System.out.println("It makes loud 'RRRRRRRRAAAARRR' sound");
    }

    @Override
    public int lifespan() {
        return lifeSpan;
    }

    @Override
    public void itCanBePregnant() {
        System.out.println("It feeds her baby with her milk");
    }
}
