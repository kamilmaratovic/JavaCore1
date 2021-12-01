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
}
