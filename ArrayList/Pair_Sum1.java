package ArrayList;
import java.util.ArrayList;
public class Pair_Sum1 {

    public static boolean pairsum(ArrayList<Integer> list , int target){
        //This is called brute force Approach :- O(n^2)
        for(int i = 0 ;i<list.size() ; i++)
        {
            for(int j = i+1 ; j<list.size() ; j++)
            {
                if(list.get(i) + list.get(j)==target)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean PairSum(ArrayList<Integer> list , int target){
        //This is Called Two Pointer Approach
        //Time complexity :- O(n)
        int lp = 0 ; int rp  = list.size()-1;
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<> ();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;
        System.out.println(PairSum(list, target));
    }
}
