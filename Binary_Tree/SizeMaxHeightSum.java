package Binary_Tree;

public class SizeMaxHeightSum {
    public static class Node{
        int data;
        Node left;  //Initially Null
        Node right; //Initially Null

        public Node(int data) {
            this.data = data;
        }
    }

    public static int size (Node root){
        if(root == null) return 0;
        return 1 + size(root.left)+ size(root.right);
    }

    public static int sum(Node root){
        if(root == null) return 0;
        return root.data + sum(root.right) + sum(root.left);
    }
    public static int Product(Node root){
        if(root == null) return 1;
        return root.data *  Product(root.right) * Product(root.left);
    }
    public static int maxNode(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int a = root.data;
        int b = maxNode(root.left);
        int c = maxNode(root.right);
        return Math.max(a , Math.max(b,c));
    }
    public static int minNode(Node root){
        if(root == null ) return Integer.MAX_VALUE;
        int a = root.data;
        int b = minNode(root.left);
        int c = minNode(root.right);
        return Math.min(a , Math.max(b,c));
    }
    public static int height(Node root){
        if(root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    static void main(String [] args) {
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
        b.right = e;
        System.out.println("Size of the Tree is :"+size(root));
        System.out.println("Sum of Nodes in this Tree is :"+sum(root));
        System.out.println("Product of Nodes in this Tree is :"+Product(root));
        System.out.println("Max Node in this Tree is :"+maxNode(root));
        System.out.println("Min Node in this Tree is :"+minNode(root));
        System.out.println("Height Of the tree is : " +height(root));
    }
}
