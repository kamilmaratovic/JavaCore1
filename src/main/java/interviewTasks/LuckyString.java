package interviewTasks;

public class LuckyString {
    public static void main(String[] args) {
        String str = "1tyuiuyt1";
        if(isLucky(str)){
            System.out.println(str+" is Lucky!");
        } else {
            System.out.println(str+" isn't Lucky!");
        }
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
}
