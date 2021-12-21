package interviewTasks;

public class PrimeNumbers {
    public static void main(String[] args) {
//        printPrime(100);
//        printPrime1(100);
//        printPrime2(100);
        printPrime3(100);

    }

    private static void printPrime3(int bound) {
        for (int i=2; i<=bound; i++){
            if(isPrime3(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime3(int number) {
        for (int i=2; i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
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


    private static boolean isPrime1 (int num){
        for (int i = 2; i<num; i++){
            if (num%i==0 && num%num==0){
                return false;
            }
        }
        return true;
    }

    private static void printPrime1 (int bound){
        for (int i = 2; i<bound; i++){
            if(isPrime1(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime2(int number){
        for (int i = 2; i<number;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
    private static void printPrime2(int bound){
        for(int i = 2; i<bound;i++){
            if(isPrime2(i)){
                System.out.println(i);
            }
        }
    }

}
