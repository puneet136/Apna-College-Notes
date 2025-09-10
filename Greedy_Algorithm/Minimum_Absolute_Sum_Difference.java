package Greedy_Algorithm;

import java.util.Arrays;

//Time Complexity : O(nlogn)
public class Minimum_Absolute_Sum_Difference {
    public static void main() {
        int [] A = {1, 2, 3};
        int [] B = {2, 1, 3};

        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff = 0;
        for(int i = 0 ; i<A.length ; i++){
            minDiff += Math.abs(A[i]-B[i]);
        }
        System.out.println("Minimum Difference of Absolute Pair is :" +minDiff);
    }
}
