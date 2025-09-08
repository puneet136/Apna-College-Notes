//If end Time array is not sorted
//T.c : O(n logn)
package Greedy_Algorithm;
import java.lang.reflect.Array;
import java.util.*;
public class Activity_Selection_1 {
    public static void main() {
        int [] start = {1, 3, 0, 5, 8, 5};
        int [] end = {2, 4, 6, 7, 9, 9};

        //Sorting
        int[][] activities = new int[start.length][3];
        for(int i = 0 ; i<start.length ; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //Sorting using lambda function and comparator
        Arrays.sort(activities , Comparator.comparingDouble(o -> o[2]));


        List<Integer> ans = new ArrayList<>();
        int maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i = 1; i<end.length ; i++){
            if(activities[i][1] >= lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.print("Max Activity is :"+maxAct+ " (");
        for(int i = 0 ; i<ans.size() ; i++){
            System.out.print("A" + ans.get(i) +" ");
        }
        System.out.print(")");
    }
}
