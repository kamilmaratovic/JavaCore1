package interviewTasks;

public class ReverseSentence {
    public static void main(String[] args) {
        final String sentence = "Today is a good day";
        reverseSentence(sentence);
    }

    private static void reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        String reverse = "";
        for (var i=words.length-1; i>=0; i--){
            reverse+=words[i]+" ";}
        System.out.println(reverse);
    }
}
