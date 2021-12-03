package interviewTasks;

public class Target {

    public static void main(String [] args) {

        int[] arr = {0, -1, 2, -3, 1};
        int []arr1 = {0, -5, 5, 2, 8, -1, -6, 6};
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
    }

    private static boolean checkPair1(int[] arr1, int arr_size1, int target1) {
        for (int i = 0; i<arr_size1; i++){
            for (int j=i+1; j<arr_size1; j++){
                if(arr1[i]+arr1[j]==target1){
                    System.out.println("This pair with a sum "+target1+" is "+arr1[i]+" and "+arr1[j]);
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean checkPair(int[] arr, int arr_size, int target) {
            for (int i = 0; i < arr_size; i++) {
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





    }
