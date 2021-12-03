package interviewTasks;

import java.util.Arrays;

public class MaximumArrayGap {
    public static void main(String[] args) {

        int[] arr1 = {1, 8, 50, 116, 80, 2, 10, 23, 200};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(maxGap1(arr1, arr1.length-1));

        int[] arr = {2,7,19,4, 12, 1, 65, 24, 80};
        Arrays.sort(arr);
        System.out.println(maxGap2(arr, arr.length-1));
    }


    public static int maxGap2 (int[] arr,int arr_size){
        int max_gap = arr[1]-arr[0];
        for (int i=0; i<arr_size; i++){
            if(arr[i+1]-arr[i]>max_gap){
                max_gap=arr[i+1]-arr[i];
            }
        }
        return max_gap;
    }

    public static int maxGap (int [] arr, int arr_size){
        int max_gap = arr[1]-arr[0];
        for (int i = 0; i<arr_size; i++){
            for (int j =i+1; j<arr_size; j++){
                if (arr[j]-arr[i]>max_gap){
                    max_gap=arr[j]-arr[i];
                }
            }
        }
        return max_gap;
    }


    public static int maxGap1 (int [] arr,int arr_size){
        int max_gap = arr[1]-arr[0];
        for (int i = 0; i<arr_size; i++){
           if( arr[i+1]-arr[i]>max_gap){
               max_gap = arr[i+1]-arr[i];
           }
                }
        return max_gap;

    }



}
