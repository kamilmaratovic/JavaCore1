package lesson11_Enums_toString;

public class App {
    public static void main(String[] args) {
        Colors pants = Colors.GREEN;
        String pantsColor = "Green";
        //"GREEN", "green"

        School newDorpHighSchool = new School("New Dorp", SchoolType.PUBLIC);
        School xx= new School("StPeter", SchoolType.PRIVATE);
    }
}
