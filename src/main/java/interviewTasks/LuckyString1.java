package interviewTasks;

public class LuckyString1 {
    public static void main(String[] args) {
        String str = "booomooob";
        if (isLucky(str)){
            System.out.println(str + " is Lucky");
        } else{
            System.out.println(str +" is not Lucky");
        }
    }

    private static boolean isLucky(String str) {
        String reverse = "";
        for (int i = str.length()-1; i>=0; i--){
            reverse = reverse+str.charAt(i);
        }
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i)!=reverse.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
