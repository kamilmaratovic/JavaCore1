package selenium_lesson4;

    public class CalculateTicket {
        private double baseFare;
        private int age;

        public CalculateTicket(double baseFare, int age) {
            this.baseFare = baseFare;
            this.age = age;
        }

        public double getTicketPrice (){
            if (this.age<=2){
                return 0;
            }
            if (this.age<13) {
                return this.baseFare*0.5;
            }
            if (this.age>66){
                return this.baseFare*0.8;
            } else return this.baseFare;
    }
    }

