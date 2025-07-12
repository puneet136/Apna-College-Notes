package ArrayList;
import java.util.ArrayList;
public class Multi_Arraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer> > MainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        MainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        MainList.add(list2);

        for(int i = 0 ; i<MainList.size() ; i++){
            ArrayList<Integer> CurrList = MainList.get(i);

            for(int j = 0 ; j<CurrList.size() ; j++){
                System.out.print(CurrList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.print(MainList);
    }
}
