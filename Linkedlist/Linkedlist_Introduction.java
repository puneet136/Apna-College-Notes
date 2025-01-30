package Linkedlist;

public class Linkedlist_Introduction {
    //This is Created A single Node
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public  int size;

    //By the Help of this Function We add elements in first of Linkedlist
    public void AddFirst(int data){
        //Step 1 - Create New Node
        Node NewNode = new Node(data);
        size++;
        //This is Base Case
        if(Head==null){
            Head = Tail = NewNode;
            return;
        }
        
        //Step2 - New Node's next = head
        NewNode.next = Head;

        //Step 3 - NewNode = head
        Head = NewNode;
    }

    //By the Help of this function we add elements in the last of linkedlist
    public void AddLast(int data)
    {
        Node NewNode = new Node(data);
        size++;
        if(Head==null)
        {
            Head = Tail = NewNode;
        }
        Tail.next = NewNode;
        Tail = NewNode;
    }

    //By the help of this function we print the linkedlist
    public void print()         //Time Complexity :- O(n)
    {
        if(Head == null)
        {
            System.out.println("LinkedList is Empty");
        }
        Node temp = Head;
        while(temp != null)
        {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }


    //By the help of this function we add elements in the at any index or any position
    public void add(int idx , int data){
        if(idx==0){
            AddFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = Head;

        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    //By the help of this function we Remove elements in the first of the linkedlist
    public int RemoveFirst(){
        if(size == 0)
        {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val = Head.data;
            Head = Tail = null;
            size = 0 ;
            return val;
        }
        //Logic of To remove the node
        int val = Head.data;
        Head = Head.next;
        size--;
        return val;
    }


    //By the help of this function we remove elements in the last of the linkedlist
    public int RemoveLast(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = Head.data;
            Head = Tail = null;
            size=0;
            return val;
        }

        // Prev : i= size-2
        Node prev = Head;
        for(int i = 0 ; i<size-2;i++){
            prev = prev.next;
        }

        int val = prev.next.data;   //Tail.next
        prev.next=null;
        Tail = prev;
        size--;
        return val;
    }

        //By the help of this function we Search the key by the help of iterative method this takes linear time complexity
        //Time Complexity : O(n)
    public int ItrSearch(int key){
        Node temp = Head;
        int i = 0 ;

        while(temp != null){
            if(temp.data == key)
            {
                return i;   //Key Found
            }
            
            temp = temp.next;
            i++;
        }
        //Key Not Found
        return -1;
    }
    //This is a helper of Recursive searching method of any key element in the list and we create this helper function because in the recursion we can pass only single argument so that by the help of this helper function we put the logic of recursion logic of searching method
    public int helper(Node Head , int key){     //Time Complexity :- O(n)
            if(Head == null)
            {
                return -1;
            }
            if(Head.data == key)
            {
                return 0;
            }
            int idx = helper(Head.next, key);
            if(idx == -1)
            {
                return -1;
            }
            return (idx+1);
    }
    public int RecSearch(int key){
        return helper(Head,key);
    }

    //This function helps our to reverse the linkedlist
    //Main pov of this function is Three Variable and Four Steps Algorithm
    //Time Complexity :- O(n)
    public void Reverse (){
        Node Prev = null;
        Node Curr = Tail = Head;
        Node next;

        while(Curr != null){
            next = Curr.next;
            Curr.next = Prev;
            Prev = Curr;
            Curr = next;
        }
        Head = Prev;
    }

    @SuppressWarnings("UnnecessaryReturnStatement")
    public void DeleteNthFromEnd(int n){
        //Calculate Size :- If in the other code the size is not calculated so that this is the code for calculate the size
        // int sz = 0;

        // Node temp = Head;

        // while(temp != null){
        //     temp = temp.next;
        //     sz++;
        // }

        if(size == n){
            Head = Head.next;       //RemoveFirst
            return;
        }

        //Traverse For Size-n
        int i= 1;
        int iToFind = size-n;
        Node prev = Head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //Check The given linkedlist is palindrome or not

    //Create a Function to find the middle node
    public Node FindMid(Node Head){         //Helper Function
        Node Slow = Head;
        Node Fast = Head;

        while(Fast != null && Fast.next != null){
            Slow = Slow.next;               //+1
            Fast = Fast.next.next;          //+2
        }
        return Slow;        //Slow is our middle Node
    }

    //Create a function to write a logic to check the given linkedlist is palindrome or not
    public boolean CheckPalindrome(){
        //Base Case
        if(Head == null || Head.next == null){
            return true;
        }

        //Step 1 :- to find the middle node

        Node MidNode = FindMid(Head);

        //Step 2 :- To reverse the half list
        Node prev = null;
        Node curr = MidNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;      //Head of half right part
        Node left = Head;

        //Step 3 :- To check the left part = right part or not
        while(right != null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    //Create A function to find the cycle in our linkedlist
    public static boolean isCycle(){    //Floyd's Cycle Finding ALgorithm
        Node slow = Head;
        Node Fast = Head;

        while(Fast != null && Fast.next != null){
            slow = slow.next;
            Fast = Fast.next.next;
            if(slow == Fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        // Detect Cycle
        Node slow = Head;
        Node fast = Head;
        boolean cycle = false;
    
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
    
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
    
        if (!cycle) { // Corrected comparison
            return;
        }
    
        // Find Meeting Point
        slow = Head;
        Node prev = null; // Initialize prev to track the last node in the cycle
    
        while (slow != fast) {
            prev = fast;  // Track the previous node
            slow = slow.next;
            fast = fast.next;
        }
    
        // Remove Cycle -> Set the last node's next to null
        prev.next = null;
    }

    private Node getMid(Node Head){
        Node slow = Head;
        Node Fast = Head.next;

        while(Fast != null && Fast.next != null){
            slow = slow.next;
            Fast = Fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public Node mergesort(Node Head){
        //Base Case

        if(Head == null || Head.next == null){
            return Head;
        }
        //Find Middle
        Node mid = getMid(Head);

        //Left & Right --> Merge Sort
        Node RightHead = mid.next;
        mid.next = null;
        Node newLeft = mergesort(Head);
        Node newRight = mergesort(RightHead);

        //Merge those single list
        return merge(newLeft , newRight);
    }
    
    // @SuppressWarnings("static-access")
    public static void main (String [] args){
        Linkedlist_Introduction ll = new Linkedlist_Introduction();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddFirst(4);
        ll.AddFirst(5);
        ll.print();

        Linkedlist_Introduction.Head = ll.mergesort(Linkedlist_Introduction.Head);
        ll.print();
    }
}
