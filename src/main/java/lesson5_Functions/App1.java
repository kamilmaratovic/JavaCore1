package lesson5_Functions;

public class App1 {
    public static void main(String[] args) {
        String studentName = "Mary";
        hi(studentName);
        hi("John");
        hi ("Matt");
        weather("NewYork", "good");
        weather("Seattle", "rainy");

        perimeter(3, 7);

        int [] numbers = {2,5,10,3,98,48, 7, 121};
        printMax(numbers);

        int [] temps = {67, 55, 91, 33, 47};
        printMax(temps);

    }

    private static void printMax(int[] arr) {
        int max = arr [0];
        for (int v : arr){
            if (v>max){
                max =v;
            }

        }
        System.out.println("Max number of array is " +max);
    }


    public static void hi(String name){
        System.out.println("Hello, "+name);
    }

    public static void weather (String city, String xx){
        System.out.println("Today at "+city+" is a "+xx+" weather");
    }

    public static void perimeter (int height, int width){
        int per =2*(height+width);
        System.out.println("perimeter lenght of rectangle with height= "+height+" and width= "+width+ " is "+per);
    }



}
