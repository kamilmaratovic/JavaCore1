package interviewTasks;

import java.util.*;

public class Target {

    public static void main(String [] args) {

        int[] arr = {0, -1, 2, -3, 1};
        Integer[] arr1 = {0, -5, 5, 2, 8, -1, -6, 6, 3};

        int target1 = 5;
        int arr_size1 = arr1.length;
        int target = -2;
        int arr_size = arr.length;

        if (checkPair(arr, arr_size, target)) {
            System.out.println("Valid pair exists");
        }
        else {
            System.out.println("No valid pair exists for " + target );
        }

        if (checkPair1(arr1, arr_size1, target1)){
            System.out.println("Valid pair exist");
        } else {
            System.out.println("No valid pair for "+target1);
        }

//        getPairsCount(arr1, target1);
       showAllPairsWithSum(arr1, target1);
    }

    private static boolean checkPair1(Integer[] arr1, int arr_size1, int target1) {
        for (int i = 0; i<=arr_size1; i++){
            for (int j=i+1; j<=arr_size1; j++){
                if(arr1[i]+arr1[j]==target1){
                    System.out.println("This pair with a sum "+target1+" is "+arr1[i]+" and "+arr1[j]);
                    return true;
                }
            }
        }

        return true;
    }


    public static boolean checkPair(int[] arr, int arr_size, int target) {
            for (int i = 0; i < arr_size-1; i++) {
                for (int j = (i + 1); j < arr_size; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println("Pair with a given sum " + target +
                                " is (" + arr[i] + ", " + arr[j] + ")");


                        return true;
                    }
                }
            }

            return false;
        }

    public static void getPairsCount(Integer[] arr1, int target1)
    {

        int count = 0;

        for (int i = 0; i < arr1.length; i++)
            for (int j = i + 1; j < arr1.length; j++)
                if ((arr1[i] + arr1[j]) == target1)
                    count++;

        System.out.printf("Count of pairs is " +count);
    }

//    private static List showAllPairsWithSum(int[] arr, int target) {
//        Map arrayMap = new HashMap();
//        List pairList = new ArrayList();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arrayMap.containsKey(target - arr[i])) {
//                Integer[] temp = {(Integer) arrayMap.get(target - arr[i]), i }; // Put the previous and current index
//                pairList.add(temp);
//            }
//            else arrayMap.put(arr[i], i);
//        }
//
//        return pairList;
//    }

    private static List<Integer> showAllPairsWithSum (Integer [] arr, int target){
        int x = 0;
        Set set = new HashSet();
        List<Integer> list= Arrays.asList(arr);
        for (int i = 0; i < arr.length; i++){
            if (list.contains(target - arr[i]) && !set.add(x)){
                x= target - arr[i];
                System.out.println("The sum of "+arr[i]+" and "+x+" is "+target);
            }
        }
        return list;
    }



    }
