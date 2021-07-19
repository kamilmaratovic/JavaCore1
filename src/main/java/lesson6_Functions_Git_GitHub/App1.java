package lesson6_Functions_Git_GitHub;

public class App1 {
    public static void main(String[] args) {
        printSum(2,5);

        printSum("Hi ", "Mike");

    }
    public static void printSum (int a, int b){
        System.out.println(a+b);
    }

    public static void printSum (String a, String b){
        System.out.println(a+b);
    }

//    public static void printSum (String zz, String xx){
//        System.out.println(zz+xx); THIS IS A WRONG SIGNATURE OF FUNCTION. WE ALREADY HAVE SIMILAR FUNCTION.
//         FUNCTION SIGNATURE CONSIST OF FUNCTION NAME AND PARAMETER. WE DON'T CARE ABOUT NAMES OF VARIABLES INSIDE

    public static void printSum (double a, double b){
        System.out.println(a+b);
    }

    //!!! If functions have the same name but different parameters it calls FUNCTIONS OVERLOADING.
}
