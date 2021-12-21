package interviewTasks;

public class PrimeNumbers1 {
    public static void main(String[] args) {

//        checkNumber(31);
//        checkNumber(2);
//        checkNumber(4);
//        checkNumber(100);
//        checkNumber(97);

        checkNumber1(5);
        checkNumber1(2);
        checkNumber1(7);
        checkNumber1(8);
        checkNumber1(9);
        checkNumber1(13);
        checkNumber1(100);
    }


    private static void checkNumber(int num) {
            boolean a = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    a = false;
                }
            }

            if (a==true) //(!a)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }

        private static void checkNumber1(int number){
        boolean b = true;
        for (int i =2; i<number; i++){
            if (number%i==0){
                b = false;
            }
        }
            if (b==true){
                System.out.println(number +" is a PRIME");
            } else {
                System.out.println(number +" is not a prime");
            }
        }


        }


