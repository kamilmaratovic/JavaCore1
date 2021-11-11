package interviewTasks;

import java.util.HashSet;
import java.util.Set;

public class DublicateArrayNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,4,6,7,1,7};

        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.print(" "+arr[j]);
                }
            }

            }

        Set<Integer> set = new HashSet<>();
        for (int v : arr){
            if (!set.add(v)){
                //(set.add(v)==false)
                System.out.print(" "+v);
            }
        }
        }
    }

