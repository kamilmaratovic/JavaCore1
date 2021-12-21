package interviewTasks;

public class LuckyString_Palindrom {
    public static void main(String[] args) {
//        String str = "1tyuiuyt1";
//        if(isLucky(str)){
//            System.out.println(str+" is Lucky!");
//        } else {
//            System.out.println(str+" isn't Lucky!");
//        }

        String str1 = "qwe8ewq1";
        if (isLucky1(str1)){
            System.out.println(str1+" is lucky");
        } else{
        System.out.println(str1+" isnt lucky");}


        String str2= "ertyytre1";
        if (isPalindrom(str2)){
            System.out.println("This is palindrom " +str2);
        } else {
            System.out.println("This is nothing "+str2);
        }

        String string = "qwe11ewq";
        if (isPalindrom2(string)){
            System.out.println(string+" is a palindrom");
        } else {
            System.out.println("This is not a palindrom");
        }
        isPalindrom2(string);

        String string1 = "1qwe1ewq";
        if (isPalindrom3(string1)){
            System.out.println(string1+" is a palindrom");
        } else {
            System.out.println(string1+ " is not a palindrom");
        }

    }

    private static boolean isPalindrom2(String string) {
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }
        for (int i = 0; i < string.length(); i++) {
            if (reverse.charAt(i) != string.charAt(i)) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }


    private static boolean isPalindrom(String str2) {
        String reverse = "";
        for (int i=str2.length()-1;i>=0; i--){
            reverse = reverse+str2.charAt(i);
        }
        for (int i =0; i<str2.length(); i++){
            if(str2.charAt(i)!=reverse.charAt(i)){
    return false;
            }
            return true;
        }
        return true;
    }

    private static boolean isLucky(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse+str.charAt(i);
        }
        for (var i = 0; i < str.length(); i++) {
            if (str.charAt(i) != reverse.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isLucky1 (String string) {
        String reverse = "";
        for (int i = string.length()-1; i>=0; i--){
            reverse+=string.charAt(i);
        }
        for (int i = 0; i<string.length(); i++){
            if (string.charAt(i)!=reverse.charAt(i)){
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrom3(String string){
        StringBuilder builder = new StringBuilder(string);
        String reverse = builder.reverse().toString();
        if (string.equals(reverse)){
            return true;
        } else{ return false;}
    }
}
