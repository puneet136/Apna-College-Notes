package Greedy_Algorithm;
import java.lang.reflect.Array;
import java.util.*;

//This code is same like Activity_Selection problem
//Time complexity : O(nlogn)
public class Max_Length_Chain_Pairs {
    public static void main() {
        int[] [] pairs = {{5, 24} , {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        Arrays.sort(pairs , Comparator.comparingDouble(o -> o[1]));
        int chainLen = 1;
        int pairEnd = pairs[0][1]; //Last Selected pair's end

        for(int i = 1 ; i<pairs.length ; i++){
            if(pairs[i][0]>pairEnd){
                chainLen++;
                pairEnd = pairs[i][1];

            }
        }
        System.out.println("Max Length of chain is : "+ chainLen);
    }
}
