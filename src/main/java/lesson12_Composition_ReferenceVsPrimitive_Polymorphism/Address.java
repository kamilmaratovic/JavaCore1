package lesson12_Composition_ReferenceVsPrimitive_Polymorphism;

public class Address {
    private String streenName;
    private String city;
    private State state;
    private int zip;

    @Override
    public String toString() {
        return "Address{" +
                "streenName='" + streenName + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                ", zip=" + zip +
                '}';
    }

    public String getStreenName() {
        return streenName;
    }

    public void setStreenName(String streenName) {
        this.streenName = streenName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public Address(String streenName, String city, State state, int zip) {
        this.streenName = streenName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}
