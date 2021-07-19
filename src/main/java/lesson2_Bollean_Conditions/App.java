package lesson2_Bollean_Conditions;

public class App {
    public static void main(String[] args) {
        int age = 20; //18

        if (age>=21){
            System.out.println("Here is your booz");
        } else {
            System.out.println("Here is your soda");
        }

        boolean b = true;
        boolean x = false;

        b= 6>7;// false
        x= 7>=7;//true

        System.out.println(x);

        boolean dd = age>21;
        System.out.println(dd);

        boolean hey = 5!=5;
        System.out.println(hey);

        //>
        //>=
        //<
        //<=
        //==
        //!=


        int ticketAge = 25;

        boolean adult = ticketAge>12 && ticketAge<66;
        System.out.println(adult);
// LOGICAL AND(&&) or multiplication
        //true && true = true
        //true && false = false
        //false && true = false
        //false && false = false

        //1*1 = 1
        //1*0 = 0
        //0*1 = 0
        //0*0 = 0

//LOGICAL OR(||) summing

        String meat = "lamb";
        boolean barbeque = meat == "lamb" || meat == "beef";
        System.out.println(barbeque);

        //true || true = true
        //true || false = true
        //false || true = true
        //false || false = false

        // 1+1 = 1
        // 1+0 = 1
        // 0+1 = 1
        // 0+0 = 0

        //Logical NOT
        //true =!false
        //false=!true

        String fish = "Mackrel";
        boolean isVegeterian = !(fish == "Mackrel");
        System.out.println(isVegeterian);

    }
}
