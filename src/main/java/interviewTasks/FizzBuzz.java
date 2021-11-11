package interviewTasks;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzbuzz (100);

//        for (var i =1; i<=100; i++){
//            fizzbuzz1(i);
//        }
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
}
