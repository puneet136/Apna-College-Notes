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

    public void AddLast(int data){
        Node newNode = new Node(data);
        size++;
        if(Head == null)
        {
            Head = Tail = newNode;
            return;
        }
        
        Node temp = Head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = null;
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

    //Remove FIrst

    public int RemoveFirst(){
        if(Head == null){
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }

        if(size==1)
        {
            int val = Head.data;
            Head = Tail = null;
            size--;
            return val;
        }
        int val = Head.data;
        Head = Head.next;
        Head.prev = null;
        size--;
        return val;
    }

    public void RemoveLast(){
        if(Head == null){
            System.out.println("Doubly LinkedList Is empty");
        }

        //If There's Only one Node
        if(Head == Tail){
            Head = Tail = null;
        }
        else{
            Node temp = new Node(3);
            temp = Head;
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
            Tail.prev = temp;
            Tail = temp;
        }
        size--;
    }
    public static Node Head;
    public static Node Tail;
    public static int size;
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.AddLast(4);

        dll.print();
        System.out.println(size);

        dll.RemoveLast();
        dll.print();
        System.out.println(size);
    }
}
