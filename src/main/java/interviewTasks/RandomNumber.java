package interviewTasks;

import javax.xml.crypto.Data;
import java.time.LocalTime;
import java.util.Date;

public class RandomNumber {

    public static void main(String[] args) {
        Date x = new Date();
        String rand = x.getTime()+"";
        System.out.println(rand.substring(9));

        String a = LocalTime.now().getNano()+"";
        a.substring(7);
        System.out.println(a);
    }
}
