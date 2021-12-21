package interviewTasks;

import java.util.HashSet;
import java.util.Set;

public class DublicateArrayNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 4, 4, 6, 7, 1, 7};

        int [] arr1 = {2, 4, 6, 2, 1, 5, 7, 12, 6, 9, 9};

        int [] arr2 = {2,4,1,2,1,6,9,4,8,12,9};

        Set<Integer> set = new HashSet<>();
        for (int v : arr) {
            if (!set.add(v)) {
//                (set.add(v)==false)
                System.out.print(" " + v);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(" " + arr[j]);
                }
            }

        }

        for (int i = 0; i<arr1.length; i++){
            for (int j=i+1; j<arr1.length; j++){
                if (arr1[i]==arr1[j]){
                    System.out.print("\n"+arr1[j]);
                }
            }
        }

        for (int i = 0; i<arr2.length; i++){
            for (int j=i+1; j<arr2.length; j++){
                if(arr2[i]==arr2[j]){
                    System.out.print("Number "+ arr2[j]+" ");
                }
            }
        }
    }}



//public static void main(String[] args) {
//    int[] arr = { 7, 5, 8, 4, 1, 2, 3, 4, 6, 9, 8, 12, 1, 0, 2};
//
//    for (int i = 0; i < arr.length; i++) {
//        for (int j = i + 1; j < arr.length; j++) {
//            if (arr[i] == arr[j]) {
//                System.out.print(arr[j]);
//            }
//        }
//    }
//}}


