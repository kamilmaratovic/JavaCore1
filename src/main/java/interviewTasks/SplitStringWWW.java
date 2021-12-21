package interviewTasks;

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

    }
}
