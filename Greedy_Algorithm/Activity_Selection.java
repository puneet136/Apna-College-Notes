//This is for if end time Array is Sorted
//T.C :O(n)
package Greedy_Algorithm;
import java.util.*;
public class Activity_Selection {
    public static void main() {
        int [] start = {1, 3, 0, 5, 8, 5};
        int [] end = {2, 4, 6, 7, 9, 9};

        List<Integer> ans = new ArrayList<>();
        int maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i = 1; i<end.length ; i++){
            if(start[i] >= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.print("Max Activity is :"+maxAct+ " (");
        for(int i = 0 ; i<ans.size() ; i++){
            System.out.print("A" + ans.get(i) +" ");
        }
        System.out.print(")");
    }
}
