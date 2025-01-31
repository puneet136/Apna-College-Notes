package Linkedlist;
public class DLL {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    //Add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(Head == null)
        {
            Head = Tail = newNode;
            return;
        }

        newNode.next = Head;
        Head.prev = newNode;
        Head = newNode;
    }

    //Print
    public void print(){
        Node temp = Head;
        while(temp != null){
            System.out.print(temp.data +"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node Head;
    public static Node Tail;
    public static int size;
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        System.out.println(size);
        
    }
}
