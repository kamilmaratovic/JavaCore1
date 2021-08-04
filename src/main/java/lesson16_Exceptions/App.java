package lesson16_Exceptions;

public class App {
    public static void main(String[] args) throws Exception {
        //Example 1: ArrayIndexOutOfBoundsException
        int[] numbers = {1, 1};
//        int b = numbers[3];
//        System.out.println(b);

        //Example 2: ArithmeticException
//        int xx = 5 / 0;

        //When we want to throw an exception we should write next one:

//        throw new NegativeArraySizeException("You did wrong");

        //in order to work with Exceptions (potentially bad code) we should use try-catch block
        System.out.println("Before try-catch");
        try {
            System.out.println("Before potential blow up");
            int xx = 5 / 1;
            int b = numbers[8];
            System.out.println("After blowing up");
        } catch (ArithmeticException error){
            System.out.println("In the catch block");

        } catch (ArrayIndexOutOfBoundsException error){
            System.out.println("It the second catch block");
        } finally { //finally block runs any way
            System.out.println("Finaly block");
        }
        System.out.println("After catch block");


    }

}
