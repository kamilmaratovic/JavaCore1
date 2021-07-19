package lesson5_Functions;

public class App2 {
    public static void main(String[] args) {
        int sum = sumOfFive(5, 6, 9, 12, 30);
        int sum1 = sumOfFive(sum, sum, 1, 2, 6);

        System.out.println(sum1);

        double lenght = getCirclePerimeter(3.2);
        System.out.println(lenght);

        int [] numbers = {2,5,10,3,98,48, 7, 121};

        int [] temps = {67, 55, 91, 33, 47};

        int maxNumber = getMax(numbers);
        int maxTemp = getMax(temps);

        System.out.println(maxNumber);
        System.out.println(maxTemp);

    }

    public static double getCirclePerimeter(double radius) {
        return 2 * radius * Math.PI;
    }

    public static int sumOfFive(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int v : arr) {
            if (v > max) {
                max = v;
            }

        }
        return max;
    }
}
