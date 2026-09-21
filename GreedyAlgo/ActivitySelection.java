
import java.util.*;

class ActivitySelection {

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // end time basis sorted

        int maxAt = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Acitvity
        maxAt = 1;
        ans.add(0);

        int lastend = end[0];

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastend) {
                // acitvity select
                maxAt++;
                ans.add(i);
                lastend = end[i];
            }
        }

        System.out.println(" Maximum activitis" + maxAt);
        for (int j = 0; j < ans.size(); j++) {
            System.out.println("A" + ans.get(j));
        }
        System.out.println();

    }

}