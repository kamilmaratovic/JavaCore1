package interviewTasks;

public class Fibonacci {

        public static void main(String args[]){
            int N = 10;
//            Fibonacci1(N);
            Fibonacci2(N);
        }

       public static void Fibonacci1(int N) {
            int num1 = 0, num2 = 1;
            int counter = 0;

            while (counter < N) {
                System.out.print(num1 + " ");
                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
                counter = counter + 1;
            }
        }

        public static void Fibonacci2(int N){
            int number1 = 0;
            int number2 = 1;
            int counter = 0;

            while (counter<N){
                System.out.print(number1+" ");
                int number3 = number1+number2;
                number1=number2;
                number2=number3;
                counter=counter+1;
            }

        }


}

