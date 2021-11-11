package interviewTasks;

public class PrimeNumbers {
    public static void main(String[] args) {
        printPrime(100);
    }

    private static void printPrime(int bound) {
        for (int i = 2; i<=bound;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i<number;i++){
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }

}
