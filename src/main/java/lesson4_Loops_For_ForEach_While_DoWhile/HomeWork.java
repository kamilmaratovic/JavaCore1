package lesson4_Loops_For_ForEach_While_DoWhile;

public class HomeWork {

    public static int findIndex(int[] arr1, int t) {
        if (arr1 == null) return -1;
        int len = arr1.length;
        int i = 0;
        while (i < len) {
            if (arr1[i] == t) return i;
            else i = i + 1;
        }
        return -1;
    }


    public static void main(String[] args) {

        System.out.println("1.__________________________");
        int[] arr = {2, 76, 9, 90, 31, 76, 6, 88, 21, 12};

        for (int v : arr) {
            System.out.println(v);

        }
        System.out.println("__________________________");

        for (int v : arr) {
            if (v % 2 == 0) {

                System.out.println(v);
            }
        }
        System.out.println("__________________________");

        for (int v : arr) {
            if (v % 3 == 0) {

                System.out.println(v);
            }
        }
        System.out.println("__________________________");

        int max = arr[0];
        for (int v : arr) {
            if (v > max) {
                max = v;
            }
        }

        int min = arr[0];
        for (int v : arr) {
            if (v < min) {
                min = v;
            }
        }
        System.out.println(max);
        System.out.println(min);

        System.out.println("__________________________");
        for (int v : arr) {
            if (v % 2 == 1) {
                System.out.println(v);
            }
        }

        System.out.println("2.__________________________");

        int[] arr1 = {10, 15, 12, 7, 88, 10, 6, 17, 23, 10, 10, 16};

        int i = 0;
        for (int v : arr1) {
            if (v==10) {
                System.out.println(i);
            }
            i++;
            }


        }
    }





//    1. create new array of int and assign {2,76,9,90,31,76,6,88,21,12} values and print it out using foreach
//    a. print all values
//    b. print only even (use if inside the loop)
//    c. printout values which divide, without remainder by 3 (use if inside the loop)
//    d. print out max value
//    e. print out min value
//    f. print out only odd numbes
//2. Create a new array of int and assign it by:
//    {10,15,12,7,88,10,6,17,23,10,10,16}
//    print out INDEXES of values which equal to 10
//    IMPORTANT: use foreach loop (not for)
//    answer is:
//            0
//            5
//            9
//            10

//    1.




