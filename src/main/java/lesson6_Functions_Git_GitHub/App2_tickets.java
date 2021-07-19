package lesson6_Functions_Git_GitHub;

public class App2_tickets {
    public static void main(String[] args) {

    double ticketPrice   = calculateTicketPrice(64, 100);
        System.out.println("Infants (0-2 years) should pay "+calculateTicketPrice(0,100)+"$");
        System.out.println("Children (3-12 years) should pay "+calculateTicketPrice(3,100)+"$");
        System.out.println("Adults (13-65 years) should pay "+calculateTicketPrice(64,100)+"$");
        System.out.println("Senior (65+ years) should pay "+calculateTicketPrice(65,100)+"$");

    }

    public static double calculateTicketPrice(int age, double baseFare){
//        if  (age<=2){
//            return 0;
//        }
//        if (age<13){
//            return baseFare*0.5;
//        }
//        if (age>65){
//            return baseFare*0.8;
//        } else return baseFare;

       // Another version
        double finalPrice;
         if (age<=2){
         finalPrice=0;
         } else if (age>2 && age<12){
         finalPrice = baseFare*0.5;
         } else if (age>12 && age<65){
         finalPrice = baseFare;
         } else finalPrice = baseFare*0.8;
        return finalPrice;
    }
}
