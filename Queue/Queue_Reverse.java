package queue;
import java.util.*;
public class Queue_Reverse {
    public static void reverse(Queue<Integer> q){
        Stack<Integer>st = new Stack<>();
        while(!q.isEmpty()) {
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }
    public static void main() {
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    reverse(q);
    System.out.print("Reversed Queue is :");
    while(!q.isEmpty()){
        System.out.print(q.remove() + " ");
    }
        System.out.println();
    }
}
