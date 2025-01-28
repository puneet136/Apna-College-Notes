package ArrayList;
import java.util.ArrayList;
public class introduction{

    public static void swap(ArrayList<Integer> list , int idx1 , int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main (String [] args){

        //ArrayList is a subpart of JAVA COLLECTION FRAMEWORK and it is a inbuilt;
        //In the Inbuilt framework we don't need to scratch file or class;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        int idx1 = 1 ; int idx2 = 3;
        swap(list, idx1, idx2);
        System.out.println(list);

            //Time Complexity :- O(n)   Reverse List
        // for(int i = list.size()-1; i>=0 ; i--){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        //For Find the maximum element in the list
        //Time Complexity :- O(n)

        // int max = Integer.MIN_VALUE;

        // for(int i = 0 ; i<list.size();i++){
        //     // if(list.get(i)>max){
        //     //     max = list.get(i);
        //     // }

        //     max= Math.max(max, list.get(i));
        // }
        // System.out.println("The Maximum Element in the List is :- "+ max);

        
    }
}
