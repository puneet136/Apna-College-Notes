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
        ll.addLast(3);

        System.out.println(ll);

        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);
    }
}
