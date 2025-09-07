package queue;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_Implementation {
    public static void main() {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        System.out.println("First Element is :" +deque.getFirst());
        System.out.println("Last Element is :" + deque.getLast());
    }
}
