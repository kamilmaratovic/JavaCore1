package interviewTasks;

import javax.xml.crypto.Data;
import java.time.LocalTime;
import java.util.Date;

public class RandomNumber {

    public static void main(String[] args) {
        Date x = new Date();
        String rand = x.getTime()+"";
        System.out.println(rand.substring(7));

        String a = LocalTime.now().getNano()+"";
        System.out.println(a.substring(1,7));

       Date date = new Date();
       String randomN = date.getTime()+"";
       System.out.println(randomN.substring(8));
    }



}
