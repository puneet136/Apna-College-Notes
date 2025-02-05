package stack;
public class Stack_Linkedlist {
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node Head = null;

        public static Boolean IsEmpty(){
            return Head == null;
        }

        //Implement Push Function
        public static void push(int data){
            Node newNode = new Node(data);
            if(IsEmpty()){
                Head = newNode;
            }
            else{
                newNode.next = Head;
                Head = newNode;
            }
        }

        //Implement Pop Function
        public static int pop(){
            if(IsEmpty()){
                return -1;
            }
            int top = Head.data;
            Head = Head.next;
            return top;
        }

        //Implement peek Function
        public static int peek(){
            if(IsEmpty()){
                return -1;
            }
            return Head.data;
        }
    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.IsEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
