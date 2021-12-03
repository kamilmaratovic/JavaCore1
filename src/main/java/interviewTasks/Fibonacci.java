package interviewTasks;

public class Fibonacci {

        public static void main(String args[]){
            int N = 10;
//            Fibonacci1(N);
            Fibonacci2(N);

            int n1 = 0;
            int n2 = 1;
            int sum = 0;

            System.out.print(n1+" "+n2);//0 1

            for (int i =2; i<10; i++){
                sum = n1+n2; //1 2 3 5 8 13
                System.out.print(" "+sum); //1 2 3 5 8 13
                n1=n2; //8
                n2=sum; //13

            }
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
            int num1 = 0;
            int num2= 1;
            int counter = 0;

            while (counter<N){
                int num3=num1+num2;
                System.out.println(num1+"");
                num1=num2;
                num2=num3;
                counter++;
            }
        }



        }





