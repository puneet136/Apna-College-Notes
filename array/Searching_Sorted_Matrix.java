package array;
public class Searching_Sorted_Matrix {

                    //For Top left Corner Condition     ---> Time complexity of this method is O(n+m)
                    //Where n and m is continuously length of row and column

    public static boolean staircase(int matrix[][] , int key) {
        int row = 0;
        int col =matrix[0].length-1;

        while(row<matrix.length && col>=0) {
            if(matrix[row][col] == key)
            {
                System.out.print("Found at " + "(" +row +"," +col +")");
                return true;
            }
            else if(matrix[row][col] > key) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key Not Found !");
        return false;
    }

                        //For Bottom Right Corner condition

    public static boolean staircase1(int matrix[][] , int key) {
        int row=matrix.length-1 , col =0;

        while(row>= 0 && col <matrix[0].length) {
            if(matrix[row][col]== key)
            {
                System.out.print("Found at " + "(" +row +"," +col +")");
                return true;
            }
            else if(matrix[row][col] > key)
            {
                row--;
            }
            else
            {
                col++;
            }
        }
        System.out.print("Key Not Found");
        return false;
    }

    public static void main(String args[]) {
        int matrix [] [] = { {10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 50} };
        int key =30;
        staircase1(matrix, key);
    }
}
