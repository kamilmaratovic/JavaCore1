package lesson4_Loops_For_ForEach_While_DoWhile;

public class App {
    public static void main(String[] args) {
//        for (int i = 0; i<5; i=i+1){
//            System.out.println("Hi!");
//            System.out.println("i="+i);

//            for (int i =5; i<10; i++){
//                System.out.println("Hello");
//                System.out.println("i="+i);

//        for (int i = 0; i<7; i=i+2){
//            System.out.println(i);
//        }


//        //Endless loop
//        for (int m = 0;true;m++) {
//            System.out.println("Endless");
//        }

//        for (int i=10; i>=0; i--){
//            System.out.println(i);
//        }
        int xx = 5;
        xx++;
        xx--;

        int b = 5;
        b += 2; //b=b+2
        b -= 1;


        System.out.println(b);

     //   7/3 =2 and 1 in remainder

        System.out.println(7%3);

//double c = 88.7;
//        for (String str = "Hello"; xx>0; c=c+0.24) {
//            System.out.println("hi");
//        }

        while (xx > 0) {
            xx = xx - 1;
            System.out.println(xx);
        }

        do {
            System.out.println("YES");
        } while (xx > 10); //Its running at least 1 time


        String[] colors = {"Red", "Green", "Blue", "Red", "Red", "Yellow"};

//        for(int i=0; i<6; i++){
//            System.out.println(colors[i]);
//        }

        String[] names = {"Jane", "Evan", "Eva", "Hanna", "David"};

//        for(int i = names.length-1; i>=0; i--){
//            System.out.println(names[i]);
//        }

//        for (String v:names){
//            System.out.println(v);
//        }

        int[] number = {2, 1, -5, 67, 89, -90, 3, -3, 33, 43, 2, 8, 0};

//        for (int v : number) {
//            if(v%2==0){
//                System.out.println(v);
//            }

//            for (int v : number) {
//                if(v%2==1 || v%2==-1){
//                    System.out.println(v);
//                }

//        for (int v : number) {
//            if(v<0) {
//                System.out.println(v);
//            }
        int max = number[0];
        for (int v : number) {
            if(max<v) {
                max = v;
            }
        }
        int min = number[0];
        for (int v : number) {
            if(min>v) {
                min = v;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

}


