package interviewTasks;

public class EndOfString {
        public static void main(String[] args) {
            String str1 = "KamilSukaev+1";
            String str2 = "1Sukaev+1";


            if (str1.endsWith(str2)){
                System.out.println("true");
            } else{
                System.out.println("false");
            }

        }
}
