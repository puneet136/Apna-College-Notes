package queue;

public class LinkedList_Implementation {
    static class Node{
         int data;
         Node next;
         Node(int data){
             this.data = data;
             this.next = null;
         }
    }
    static class queue {
        static Node head;
        static Node tail;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next=newNode;
            tail = newNode;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = head.data;
            //Single Element
            if(tail == head){
                tail = head = null;
            }
            else{
                head = head.next;
            }
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }
    static void main(String[] args){
        queue q = new queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
