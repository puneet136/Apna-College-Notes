package Binary_Tree;

public class TreeTraversal {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    public static void preorder(Node root){
        //Preorder is Node -> Left -> Right
        if(root == null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        //Inorder is Left -> Node -> Right
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+"  ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        //PostOrder is Left -> Right -> Node
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+ " ");
    }
    public static void nthLevel(Node root, int n){
        if(root == null) return;
        if(n ==0 ) System.out.print(root.data + " ");
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }
    public static int height(Node root){
        if(root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    public static void main(String [] args){
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        int level = height(root) +1 ;
        for(int i = 0 ; i<level ; i++){
            nthLevel(root , i);
            System.out.println();
        }
    }
}
