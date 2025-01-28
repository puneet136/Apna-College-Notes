package ArrayList;
import java.util.ArrayList;
public class Container_Water {

    public static int StoreWater(ArrayList<Integer> Height)
    {
        //This is Brute Force Approach :- O(n^2)
        int maxwater  = 0;

        for(int i=0;i<Height.size();i++){
            for(int j = i+1 ; j<Height.size() ; j++){
                int ht = Math.min(Height.get(i) , Height.get(j));
                int width = j-i;
                int currwater = ht * width;

                maxwater = Math.max(maxwater , currwater);
            }
        }
        return maxwater;
    }

    public static int Storewater(ArrayList<Integer> Height){
        //This is called Two Pointer Approach :- O(n)
        int maxwater = 0 ;
        int lp = 0 ;
        int rp = Height.size()-1;

        while(lp<rp){
            //Calculate water area
            int ht = Math.min(Height.get(lp) , Height.get(rp));
            int width = rp-lp;

            int currwater = ht * width ;

            maxwater = Math.max(currwater , maxwater);

            //Update Ptr
            if(Height.get(lp)<Height.get(rp)){
                lp++;
            }
            else {
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> Height = new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);

        System.out.println("Maximum Water is " + StoreWater(Height));
        System.out.print(Storewater(Height));
    }
}
