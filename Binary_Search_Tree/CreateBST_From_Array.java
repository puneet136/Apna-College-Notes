package Binary_Search_Tree;

public class CreateBST_From_Array {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(Node root){
        if(root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node CreateBST(int [] arr , int si , int ei){
        if(si > ei){
            return null;
        }
        int mid = si + (ei - si)/2;

        Node root = new Node(arr[mid]);
        root.left = CreateBST(arr , si , mid-1);
        root.right = CreateBST(arr, mid+1 , ei);

        return root;
    }
    public static void main(String [] args) {
        int [] arr = {3, 5, 6, 8, 10, 11, 12};
        /*
                     8
                  /     \
                 5       11
                /  \    /  \
               3    6  10  12
               Expected BST
         */
        Node root = CreateBST(arr, 0, arr.length-1);
        preorder(root);
    }
}
