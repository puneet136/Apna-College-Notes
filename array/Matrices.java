package array;
import java.util.*;
public class Matrices{

    public static void search(int Matrix[][] , int key)
    {
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int[] Matrix1 : Matrix) {
            for (int j = 0; j<Matrix[0].length; j++) {
                if (Matrix1[j] > max) {
                    max = Matrix1[j];
                }
                if (Matrix1[j] < min) {
                    min = Matrix1[j];
                }
            }
        }
        System.out.println("Maximum Element is : "+max);
        System.out.println("Minimum Element is : " +min);
    }
    public static void main(String[] args) {
        int Matrix [][] = new int [3][3];

        int n =Matrix.length , m = Matrix[0].length;

        //n --> Rows , m--> Columns

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<n; i++) {
                for(int j = 0 ; j< m ; j++) {
                    Matrix[i] [j]=sc.nextInt();
                }
        }

        //output

        for(int i = 0; i<n;i++) {
            for(int j = 0 ;j<m;j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(Matrix, 9);
    }
    
}