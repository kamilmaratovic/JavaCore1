package lesson8_Classes_Fields_Methods;

import java.util.Arrays;

public class HomeWork1 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 6, 7, 8};
        int a = sum(arr1);
        System.out.println(a);

        int[] arr2 = new int[] {3, 9, 1, 8, 4, 8, 5};
       sort(arr2);


        int[] arr3 = {3,9,1,8,4,8,5};
        int b= min(arr3);
        System.out.println(b);

    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int v : arr) {
//            sum = Arrays.stream(arr).sum();

              sum=sum+v; //sum+=v;
        }
        return sum;
    }

    public static void sort(int[] arr) {
        Arrays.sort(arr);
        for (int v: arr) {
            System.out.println(v);
//            System.out.println(Arrays.toString(arr));
        }

    }

    public static int min (int[] arr){

        int min = arr [0];
        for (int v : arr){
            if (v<min){
                min=v;
            }
        }
        return min;
    }




}






//1. Create function `sum` - which takes int[] as a param and returns sum of all elements of the array.
// invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result
//2. Create function sort - which takes  int[] as a param and print out sorted array invoke it from main()
// - pass {3,9,1,8,4,8,5} as a param (this will be void func)
//3. Create a function  which takes int[] as a param and returns min of the array invoke it from main()
// - pass {3,9,1,8,4,8,5} as a param
