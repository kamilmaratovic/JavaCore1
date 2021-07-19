package lesson3_Arrays;

public class HomeWork {
    public static void main(String[] args) {

//        1. create an Array with int - at least 7 values
//        Example [2,76,9,90,31,76,2,76,21,12]
//        print out it values
//        2. Create an empty array with 5 values
//        fill it out with values
//        print it out
//        3. Create an array of booleans, fill it by values, print it out

       // 1.
         int [] arr = {2,76,9,90,31,76,2,76,21,12};
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        System.out.println(arr[7]);
        System.out.println(arr[8]);
        System.out.println(arr[9]);

        //2.
        int [] arr1 = new int[5];
        arr1 [0] = 10;
        arr1 [1] = -6 ;
        arr1 [2] = 36;
        arr1 [3] = 7;
        arr1 [4] = 0;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);


        boolean[] answers = {true, false, false, 5>6, 7<-23, 5==3, 5!=3, 45>7 && 45<95};
        System.out.println(answers.length);
        System.out.println(answers[0]);
        System.out.println(answers[1]);
        System.out.println(answers[2]);
        System.out.println(answers[3]);
        System.out.println(answers[4]);
        System.out.println(answers[5]);
        System.out.println(answers[6]);
        System.out.println(answers[7]);
    }
}
