package lesson16_HomeWork1.level4_Mammals;

import lesson16_HomeWork1.level3_Vertebrates.Mammals;

public abstract class Whales implements Mammals {
    protected String name;
    protected int legsNumber;
    protected String feedType;
    protected int lifeSpan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegsNumber() {
        return legsNumber;
    }

    public void setLegsNumber(int legsNumber) {
        this.legsNumber = legsNumber;
    }

    public String getFeedType() {
        return feedType;
    }

    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public Whales(String name, int legsNumber, String feedType, int lifeSpan) {
        this.name = name;
        this.legsNumber = legsNumber;
        this.feedType = feedType;
        this.lifeSpan = lifeSpan;

    }
}
