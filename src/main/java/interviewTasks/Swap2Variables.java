package interviewTasks;

public class Swap2Variables {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);

        int x = 15;
        int y = 20;

        x = x+y;
        y = x-y;
        x= x-y;

        System.out.println(x);
        System.out.println(y);

        int z = 50;
        int v = 15;

        z=z+v;
        v = z-v;
        z = z-v;

        System.out.println(z);
        System.out.println(v);
    }
}
