package interviewTasks;


import java.util.ArrayList;
import java.util.List;

public class SplitStringWWW {
    public static void main(String[] args) {
        String xx = "https://www.google.com/search?rlz=1C5CHFA_enUS908US908&sxsrf=ALeKk03MX5pstSrmFY2r3lUOJm9vqpximA%3A1601598639474&ei=r3R2X4WkHLK0ytMPwpiV4Ak&q=java&oq=java&gs_lcp=CgZwc3ktYWIQAzIECAAQRzIECAAQRzIECAAQRzIECAAQRzIECAAQRzIECAAQRzIECAAQRzIECAAQR1AAWABg9cUCaABwAngAgAEAiAEAkgEAmAEAqgEHZ3dzLXdpesgBCMABAQ&sclient=psy-ab&ved=0ahUKEwjFt-nv05TsAhUymnIEHUJMBZwQ4dUDCA0&uact=5";
        String[] spl = xx.split("\\?");
        String params = spl[1];
        String[] pr = params.split("&");
        for (String v: pr){
//            System.out.println(v.split("=")[0]+": "+v.split("=")[1]);
        }

        String [] split = xx.split("\\?");
        String yy = split[1];
        String[] vv = yy.split("&");
        for (String v: vv){
            System.out.println(v.split("=")[0]+" : "+v.split("=")[1]);
        }


        String zz = "I like learning Java asdhjjhjhjhkjhjkhjk";
        int N = 5;
        List<String> a = divideStringbyN(zz, N);
        List<String> b = divideStringbyN1(zz, N);
        System.out.println(a);
        System.out.println(b);
        }

    public static List<String> divideStringbyN(String string, int N) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i<string.length(); i+=N){
            result.add(string.substring(i, Math.min(string.length(), i+N)));
        }

        return result;
            }
    public static List<String> divideStringbyN1(String string, int N) {
        List<String> result1 = new ArrayList<>();
        int i = 0;
       while(i<string.length()-1){
           result1.add(string.substring(i, i+N));
           i+=N;
       }

        return result1;
    }


    }












