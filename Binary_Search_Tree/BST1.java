package Binary_Search_Tree;

import java.util.ArrayList;
import java.util.List;

public class BST1 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left , val);
        }
        else{
            root.right = insert(root.right , val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean Search(Node root , int key){  //O(H)
        if(root == null) return false;

        if(root.data == key) return true;

        if(root.data > key){
            return Search(root.left , key);
        }
        return Search(root.right ,key);
    }

    public static Node delete(Node root , int val){
        if(root.data < val){
            root.right = delete(root.right , val);
        }
        else if(root.data > val){
            root.left = delete(root.left , val);
        }
        else{
            //Case -1 : Leaf Node
            if(root.left == null && root.right == null){
                return null;
            }

            // Case 2 : Single Child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //Case 3 : Both Children
            Node IS = FindInOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right , IS.data);
        }
        return root;
    }

    public static Node FindInOrderSuccessor(Node root){
     while(root.left != null){
         root = root.left;
     }
     return root;
    }

    //This Method is Implemented for printing nodes between the given range
    public static void printInRange(Node root , int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRange(root.left , k1 , k2);
        }
        else{
            printInRange(root.right , k1, k2);
        }
    }

    public static void PrintPath(ArrayList<Integer> path){
        for(int i = 0 ; i< path.size() ; i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void printRoot2Leaf(Node root , ArrayList<Integer> path){
        if(root == null){
            return ;
        }

        path.add(root.data);
        if(root.left == null && root.right == null){
            PrintPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.removeLast();
    }

        //This Commented Portion is the Easy Approach of Shows that the given BST is Valid or Not
        //Time Complexity : O(n) and Space Complexity : O(n)
    /*
    static List<Integer> list = new ArrayList<>();
    public static boolean isValidBST(Node root){
        if(root == null) return true;
        Inorder(root);
        for(int i = 1 ; i<list.size(); i++){
            if (list.get(i) <= list.get(i-1)){
                return false;
            }
        }
        return true;
    }
    private static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        list.add(root.data);
        Inorder(root.right);
    }
    */

    public static void main(String [] args) {
        int [] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0 ; i<values.length ; i++){
            root = insert(root , values[i]);
        }
        inorder(root);
        System.out.println();
        printRoot2Leaf(root, new ArrayList<>());
    }
}
