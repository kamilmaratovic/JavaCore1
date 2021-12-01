package interviewTasks;

public class MaximumArrayGap {
    public static void main(String[] args)
    {
        MaximumArrayGap maxdif = new MaximumArrayGap();
        int arr[] = {1, 2, 90, 10, 110};
        System.out.println("Maximum difference is " +
                maxdif.maxDiff(arr, 5));
    }

   public int maxDiff(int arr[], int arr_size)
    {
        int max_diff = arr[1] - arr[0];
        int i, j;
        for (i = 0; i < arr_size; i++)
        {
            for (j = i + 1; j < arr_size; j++)
            {
                if (arr[j] - arr[i] > max_diff)
                    max_diff = arr[j] - arr[i];
            }
        }
        return max_diff;
    }


}
