package Linkedlist;
import java.util.LinkedList;

public class Linkedlist_Framework {
    public static void main(String args[]){
        //Create
        LinkedList<Integer> ll = new LinkedList<>();

        //Add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        
        System.out.println(ll);
    }
}
