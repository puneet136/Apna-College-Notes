package Binary_Search_Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Merge2_BSTs {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> list){
        if(root == null) return;

        getInorder(root.left,list);
        list.add(root.data);
        getInorder(root.right ,list);
    }

    public static Node ConvertBST(ArrayList<Integer> list , int si , int ei){
        if(si > ei) return null;
        int mid = (si + ei) / 2;
        Node root = new Node(list.get(mid));
        root.left = ConvertBST(list, si , mid-1);
        root.right = ConvertBST(list, mid+1, ei);
        return root;
    }
    public static Node mergeBSTs(Node root1, Node root2){
        //Step 1 : Convert BST to sorted list 1 using Inorder Traversal
        ArrayList<Integer> list1 = new ArrayList<>();
        getInorder(root1, list1);

        //Step 2 : Convert BST to sorted list 2 using Inorder Traversal
        ArrayList<Integer> list2 = new ArrayList<>();
        getInorder(root2, list2);

        //Step 3 : Merge Both of Lists in sorting nature
        ArrayList<Integer> finalList = getIntegers(list1, list2);

        //Step 4 : Convert Sorted List to Balanced BST
        return ConvertBST(finalList, 0, finalList.size()-1);
    }

    private static ArrayList<Integer> getIntegers(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int i = 0 , j = 0;
        ArrayList<Integer> finalList = new ArrayList<>();
        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) <= list2.get(j)){
                finalList.add(list1.get(i));
                i++;
            }
            else{
                finalList.add(list2.get(j));
                j++;
            }
        }

        while(i < list1.size()){
            finalList.add(list1.get(i));
            i++;
        }
        while(j < list2.size()){
            finalList.add(list2.get(j));
            j++;
        }
        return finalList;
    }

    public static void preorder(Node root){
        if(root == null) return;


        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args){
        /*
                    2
                   / \
                  1   4
                  BST 1
         */

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        /*
                    9
                   / \
                  3   12
                  BST 2
         */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        /*
                    3
                  /   \
                 1     9
                  \   / \
                  2  4  12
                  Final BST
         */

        Node root = mergeBSTs(root1, root2);
        preorder(root);
    }
}
