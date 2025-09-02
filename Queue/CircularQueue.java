package queue;

public class CircularQueue {
    static class queue {
        static int[] arr;
        static int size;
        static int rear;
        static int front;

        queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear +1)%size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            //If we are add 1st element in the circular queue
            if(front == -1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];
            //Last Element Delete
            if(rear == front){
                rear = front = -1;
            }
            else{
                front = (front +1)%size;
            }
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }
    static void main(String[] args){
        queue q = new queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        // 1 2 3 4
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
