package lesson2_Bollean_Conditions;

public class HomeWork {
    public static void main(String[] args) {

        int a=100;
        int x=12;
        int d=12;
        int c=122;

        //Find zz

        boolean zz1 = a==d;
        boolean zz2 = x==d;
        boolean zz3 = c>=a;
        boolean zz4 = x>=d;
        boolean zz5 = (d==c) || (x==d);
        boolean zz6 = (c>x) && (d>=x);
        boolean zz7 = (a>x) || (a>c);
        boolean zz8 = (a==c) && (d==c);
        boolean zz9 = (c==c) && (a>=a);
        boolean zz0 = (c>c) || (a<=a);
        boolean zz10 = (x>a) && (c==d);
        boolean zz11 = (c>a) && (x>d);

        System.out.println(zz1);
        System.out.println(zz2);
        System.out.println(zz3);
        System.out.println(zz4);
        System.out.println(zz5);
        System.out.println(zz6);
        System.out.println(zz7);
        System.out.println(zz8);
        System.out.println(zz9);
        System.out.println(zz10);
        System.out.println(zz11);

        int age = 16;

        if (age <= 12 || age >=65) {
            System.out.println("your ticket is free");
        } else {
            System.out.println("you should pay");
        }

        int age1 = 21;
        int heigh = 155;

        if (age1<=16 || heigh<=160) {
            System.out.println("You not pass");
        } else {
            System.out.println("You pass");
        }
    }

}
