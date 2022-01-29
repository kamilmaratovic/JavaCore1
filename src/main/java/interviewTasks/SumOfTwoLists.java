package interviewTasks;

import java.util.*;

public class SumOfTwoLists {
    public static void main(String[] args) {
        List<String> colors1 = new ArrayList<String>(Arrays.asList("blue", "white", "red", "green", "yellow"));
        List<String> colors2 = new ArrayList<>(Arrays.asList("blue", "white", "red", "green"));

        Set<String> set = new HashSet<>(colors1);
        set.addAll(colors2);
        List<String> combineList = new ArrayList<>(set);
        System.out.println(set);
    }


}
