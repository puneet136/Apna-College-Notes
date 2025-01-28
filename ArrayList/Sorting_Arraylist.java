package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class Sorting_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(3);
        list.add(24);
        list.add(5);
        list.add(9);

        //This is for Sorting in Ascending Order
        Collections.sort(list);
        System.out.println(list);

        // This is for sorting in Descending Order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
