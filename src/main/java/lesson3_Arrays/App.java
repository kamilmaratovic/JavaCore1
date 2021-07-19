package lesson3_Arrays;

public class App {
    public static void main(String[] args) {
        int a0 = 3;
        int a1 = 5;
        int a2 = -5;
        int a3 = 89;

        int [] a = {3,5,-5,89};
        System.out.println(a[2]);
        System.out.println(a[3]);

        String [] row1 = {"John", "Mary", "Jake", "Jane", "Boris", "Hanna", "Alexis", "Cristin", "David", "Travis"};

        System.out.println(row1[2]);

        row1[0]  = "Den";

        System.out.println(row1[0]);
        System.out.println(row1.length);

        String[] colors = {"Red", "Pink", "Magenta", "Crimson", "Brown", "White", "Blue", "Orange", "Yellow", "Cyan"};
        System.out.println(colors[colors.length-1]);


//        System.out.println(a[10]); //ArrayIndexOutOfBoundsException

        int[] arr = new int[5];
        System.out.println(arr[1]);
        arr[0]= -4 ;
        arr[1]= -5;
        arr[2]= 0;
        arr[3]= 0;
        arr[4]= -5;

        System.out.println(arr[1]);

        String [] fruits = new String[2];
        System.out.println(fruits[0]);
        fruits [0] = "";
        fruits [1] = "Apple";


        System.out.println(fruits[0]);
        System.out.println(fruits[1]);

        fruits[0] = "Plum";
        fruits[1] = "Pineapple";

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);

        boolean[] answers = {true, false, false, 5>6, 7<-23, 5==3, 5!=3, 45>7 && 45<95};

        boolean [] xx = new boolean[1];
        System.out.println(xx[0]);



    }
}
