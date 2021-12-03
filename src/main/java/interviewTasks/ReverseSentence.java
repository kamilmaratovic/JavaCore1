package interviewTasks;

public class ReverseSentence {
    public static void main(String[] args) {
//        final String sentence = "Today is a good day";
//        reverseSentence(sentence);
//        reverse1("Fuck off");
//        reverseWord("Kamil");

//        System.out.println(reverseString("Kamil"));
//        System.out.println(reverseString("Kamil"));
//
//        System.out.println(StringFormatter.reverseString("Kamil"));
        reverseName("Kamzikus");
        reverseName1("Kamil");
    }

    private static void reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        String reverse = "";
        for (var i=words.length-1; i>=0; i--){
            reverse+=words[i]+" ";}
        System.out.println(reverse);
    }

        public static String reverseString(String str){
            char ch[]=str.toCharArray();
            String rev="";
            for(int i=ch.length-1;i>=0;i--){
                rev+=ch[i];
            }
            return rev;
        }

    public static class StringFormatter {
        public static String reverseString(String str){
            StringBuilder sb=new StringBuilder(str);
            sb.reverse();
            return sb.toString();
        }
    }

    public static void reverse1 (String sentence1){
        String[] words1 = sentence1.split(" ");
        String reverse = "";
        for (int i = words1.length-1; i>=0; i--){
            reverse+=words1[i]+" ";
            System.out.println(reverse);
        }
    }

    public static void reverseWord (String word){
        char [] letters = word.toCharArray();
        String reverse = "";
        for (int i = letters.length-1; i>=0; i--){
            reverse+=letters[i];
        }
        System.out.println(reverse);
    }

    public static void reverseName (String name){
        char[] letters = name.toCharArray();
        String reverse = "";
        for (int i = letters.length-1; i>=0; i--){
            reverse+=letters[i];
        }
        System.out.println(reverse);
    }

    public static void reverseName1(String name){
        StringBuilder builder = new StringBuilder(name);
        System.out.println(builder.reverse());

    }

}

