package lesson11_Enums_toString;

public class App1 {
    public static void main(String[] args) {

        Address myAddress = new Address("123 Elm St", "Brooklyn", State.NY, 11235);

        System.out.println(myAddress);

        Subjects[] alanSubs = {Subjects.CS, Subjects.ENGLISH, Subjects.MATH};
        Student alan = new Student (alanSubs, "Alan Berkly", Subjects.MATH);
        System.out.println(alan);
    }
}
