package interviewTasks;

import org.apache.logging.log4j.core.appender.rolling.action.IfAll;

import java.util.Arrays;
import java.util.Locale;

public class Anagramm {
    public static void main(String[] args) {
        String str1 = "Thing";
        String str2 = "Night";

        String string1 = "Golem1";
        String string2 = "Ogelm";

        boolean check1 = isAnagram1 (string1, string2);
        System.out.println(check1);

        boolean check = isAnagram(str1, str2);
        System.out.println(check);
    }

    private static boolean isAnagram1(String string1, String string2) {
        String normal1 = string1.toLowerCase();
        String normal2 = string2.toLowerCase();

        char[] word1 = normal1.toCharArray();
        char[] word2 = normal2.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        for (int i =0; i<word1.length; i++){
            if (word1[i]!=word2[i]){
                return false;
            }
            return true;
        }
        return true;
    }


    private static boolean isAnagram(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return false;
        }
        String normal1 = str1.toLowerCase();
        String normal2 = str2.toLowerCase();

        char[]word1=normal1.toCharArray();
        char[]word2=normal2.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        for(int i=0; i<word1.length; i++){
            if (word1[i] != word2[i]){
                return false;
            }
            return true;
        }
        return true;
    }

}
