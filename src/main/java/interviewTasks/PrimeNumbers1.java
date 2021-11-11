package interviewTasks;

public class PrimeNumbers1 {
    public static void main(String[] args) {

        checkNumber(31);
        checkNumber(2);
        checkNumber(4);
        checkNumber(100);
        checkNumber(97);
    }


    private static void checkNumber(int num) {
            boolean a = false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    a = true;
                    break;
                }
            }

            if (a==false) //(!a)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
        }


