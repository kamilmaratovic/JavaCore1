package interviewTasks;

import java.util.Random;

public class Dice {
//    public static void main(String[] args) {
//
//        int[] dices = throw5Dices();
//        int steps = calculateSteps(dices);
//        System.out.println("Steps: "+steps);
//
//
//    }
//
//    private static int calculateSteps(int[] dices) {
//        int steps = 0;
//        for (int v: dices){
//            if(v==1){
//                steps+=2; //steps=steps+2
//                continue;
//            }
//            if(v==6){
//                continue;
//            }
//            steps++;
//        }
//        return steps;
//    }
//
//    private static int[] throw5Dices() {
//        Random random = new Random();
//        int[]arr = new int[5];
//        for (int i=0;i<5;i++){
//            arr[i] = random.nextInt(6)+1;
//            System.out.println("Number: "+arr[i]);
//        }
//        return arr;
//    }

    public static void main(String[] args) {
        int[] dices = throw5Dices();
        int steps = calculateSteps (dices);
        System.out.println(steps);

        int [] dice = fiveDices();
        int step = printSteps(dice);
        System.out.println(step);

    }

    private static int printSteps(int[] dice) {
        int step = 0;
        for (int v: dice){
            if (v==1){
                step+=2;
                continue;
            }
            if (v==6){
                continue;
            } step++;
        }
          return step;
        }


    private static int[] fiveDices() {
        Random random = new Random();
        int[] dices= new int[5];
        for (int i = 0; i<5; i++){
            dices[i] = random.nextInt(6)+1;
            System.out.println("Number "+dices[i]);
        }
        return dices;
    }


    private static int calculateSteps(int[] dices) {
        int steps = 0;
        for (int v : dices){
            if (v==1){
                steps+=2;
                continue;
            }
            if (v==6){
                continue;
            }
            steps++;
        }
        return steps;
    }

    private static int[] throw5Dices() {
        Random random = new Random();
        int [] arr = new int[5];
        for (int i = 0; i<5; i++){
            arr[i] = random.nextInt(6)+1;
            System.out.println("Number "+arr[i]);
        }
        return arr;
    }



}
