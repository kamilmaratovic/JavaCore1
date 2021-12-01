package interviewTasks;

public class Remainder {

    public static void main(String[] args) {
        int rem = getRemainder (16, 5);
        int rem1 = getRemainder1 (20, 6);
        System.out.println(rem);
        System.out.println(rem1);

        int rem2 = getRemainder1 (20, 6);
        System.out.println(rem2);
    }

    private static int getRemainder1(int a, int b) {
        while (a>b){
            a=a-b;
        }
        if (a==b){
            return 0;
        }
        return a;
    }

    private static int getRemainder(int a, int b) {
        while(a>b){
            a = a-b;
        }
        if (a==b){
            return 0;
        }
        return a;
    }

    private static int getRemainder2(int a, int b){
       int c = a/b;
       return a-c*b;
    }
}
