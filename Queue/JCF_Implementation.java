package queue;
import java.util.*;
public class JCF_Implementation {
    public static void main(String [] args) {
        //There Are two types of implementing a queue -> (i) Using Linkedlist (ii) Using ArrayDeque
//        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
