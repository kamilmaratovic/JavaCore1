package interviewTasks;

import java.math.MathContext;
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

        int [] arr2 = {4, 12, 8, 41, 27, 19, 56, 20, 62};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
//        System.out.println("Max gap is "+maxGap3(arr2, arr2.length-1));
maxGap3(arr2, arr2.length-1);
    }

    private static Integer maxGap3(int[] arr2, int arr_size) {
        Integer max_gap = arr2[1]-arr2[0];
        for (int i = 0; i<arr_size; i++){
            if (arr2[i+1]-arr2[i]>max_gap) {
                max_gap=arr2[i+1]-arr2[i];
                System.out.println("Max gap for "+arr2[i]+ " and "+arr2[i+1]+" is "+max_gap);
                }
            }

        return max_gap;
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
