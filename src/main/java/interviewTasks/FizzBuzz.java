package interviewTasks;

public class FizzBuzz {
    public static void main(String[] args) {
//        fizzbuzz (100);
//
//        for (var i =1; i<=100; i++){
//            fizzbuzz1(i);
//        }

        for (int j = 1; j<=100; j++){
            fizzBuzz(j);
        }
    }

    private static void fizzbuzz1(int i) {
        if (i%3==0 && i%5==0){
            System.out.println(i+" FizzBuzz");
        } else {
            if (i%3==0){
            System.out.println(i+" Fizz");
        }   if (i%5==0){
                System.out.println(i+" Buzz");
            }
        }
    }

    private static void fizzbuzz(int boarder) {
        for (int i = 1; i<=boarder; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FIZZBUZZ");
                continue;
            } else if (i%3==0){
                System.out.println("FIZZ");
                continue;
            } else if (i%5==0){
                System.out.println("BUZZ");
                continue;
            }
            System.out.println(i);
        }
    }

    private static void fizzBuzz (int j){
        if (j%3==0 && j%5==0){
            System.out.print("FizzBuzz ");
        }
        if ((j%3==0)){
            System.out.print("Fizz ");
        }
        if ((j%5==0)){
            System.out.print("Buzz ");
        }
        System.out.println(j);
    }
}
