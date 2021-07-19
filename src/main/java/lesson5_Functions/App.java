package lesson5_Functions;

public class App {
    public static void main(String[] args) {
        hi();
        printLine();
        System.out.println("!!!!!!");
        printLine();
        hi();
        printLine();
        hello();
        printLine();
    }
    public static void hi (){
        System.out.println("Hi, my friend!!!");
        System.out.println("Today is a good day");
    }

    public static void hello (){
        printDoubleLine();
        System.out.println("HELLO - HELLO");
        printDoubleLine();
    }

    public static void printLine (){
        System.out.println("___________________________________");
    }

    public static void printDoubleLine (){
        System.out.println("====================================");
    }
}
