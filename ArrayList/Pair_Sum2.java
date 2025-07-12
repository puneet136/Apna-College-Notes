package ArrayList;
import java.util.ArrayList;
public class Pair_Sum2 {

    public static boolean PairSum2(ArrayList<Integer> list , int target){
        //This is Two Pointer Approach :- O(n)
        int pivot = -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1))
            {
                pivot = i;
                break;
            }
        }

        int lp = pivot+1;   //Smallest
        int rp = pivot;     //Largest
        while(lp != rp){
            if(list.get(lp) + list.get(rp)==target){
                return true;
            }

            else if(list.get(lp) + list.get(rp) < target){
                //Move Forward Circularly
                lp = (lp+1)%list.size();
            }
            else{
                //Move Backward Circularly
                rp = (list.size()+rp-1)%list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        //Given List is :- 10,11,6,7,8,9 :- Which is Sorted And Rotated
        int target = 160;
        System.out.print(PairSum2(list,target));
    }
}
