package Binary_Tree;

import java.util.*;

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
        if(root == null ) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }

    public static int countNodes(Node root ){
        if(root == null){
            return 0;
        }
        int leftcount = countNodes(root.left);
        int rightcount = countNodes(root.right);
        return leftcount+rightcount+1;
    }

    //This is Approach 1 Which Takes Quadratic Time complexity to recursively calculation of height o
    public static int diameter2(Node root){
        if(root == null){
            return 0;
        }
        int leftDiameter = diameter2(root.left);
        int leftHeight = height(root.left);
        int rightDiameter = diameter2(root.right);
        int rightHeight = height(root.left);

        int selfDiameter = leftHeight+rightHeight+1;

        return Math.max(selfDiameter , Math.max(leftDiameter , rightDiameter));
    }

//    static class Info{
//        int diam;
//        int ht;
//
//        public  Info(int diam , int ht){
//            this.diam = diam;
//            this.ht = ht;
//        }
//    }
//
//    //Takes O(n)
//    //This info class is created for solve the Diameter of any tree
//    public static Info diameter(Node root){
//
//        if(root == null){
//            return new Info(0,0);
//        }
//        Info leftinfo = diameter(root.left);
//        Info rightinfo = diameter(root.right);
//
//        int diam = Math.max(Math.max(leftinfo.diam , rightinfo.diam), leftinfo.ht+rightinfo.ht+1);
//        int ht = Math.max(leftinfo.ht , rightinfo.ht) + 1;
//        return new Info(diam , ht);
//    }
//
//    public static boolean isIdentical(Node root , Node subroot){
//        if(root == null && subroot == null){
//            return true;
//        }
//        else if(root == null || subroot == null || root.data != subroot.data){
//            return false;
//        }
//        if(!isIdentical(root.left , subroot.left)){
//            return false;
//        }
//        if(!isIdentical(root.right , subroot.right)){
//            return false;
//        }
//        return true;
//    }
//    public static boolean isSubtree(Node root , Node subroot){
//        if(root == null){
//            return false;
//        }
//        if(root.data == subroot.data){
//            if(isIdentical(root , subroot)){
//                return  true;
//            }
//        }
//        return isSubtree(root.left , subroot) || isSubtree(root.right , subroot);
//    }

    //This class for solving the problem of TopView of any tree
    static class info{
        Node node;
        int hd;

        public info(Node node , int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void TopView(Node root){
        //Level Order Traversal
        Queue<info> q = new LinkedList<>();
        HashMap<Integer , Node> map = new HashMap<>();
        int min = 0 , max = 0;
        q.add(new info(root , 0));
        q.add(null);

        while(!q.isEmpty()){
            info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.hd)){  //First time my HD is occurring
                    map.put(curr.hd , curr.node);
                }

                if(curr.node.left != null){
                    q.add(new info(curr.node.left , curr.hd-1));
                    min = Math.min(min , curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new info(curr.node.right , curr.hd+1));
                    max = Math.max(max , curr.hd+1);
                }
            }

        }

        for(int i = min ; i<= max ; i++){
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){

        /*
                1
               /  \
              2    3
             / \  / \
            4   5 6  7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
                2
               / \
              4   5
        */
//        Node subroot = new Node(2);
//        subroot.left = new Node(4);
//        subroot.right = new Node(5);
//        TopView(root);
        nthLevel(root , 3);
    }
}
