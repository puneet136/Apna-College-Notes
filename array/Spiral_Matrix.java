package array;
public class Spiral_Matrix {
    public static void printspiral (int matrix[] [] ) {
        int StartRow = 0;
        int EndRow = matrix.length-1;
        int StartCol = 0;
        int EndCol = matrix[0].length-1;

        while(StartRow<= EndRow && StartCol <= EndCol) {

        //Top Boundary
        for(int j=StartCol ;j<=EndCol ;j++)
        {
            System.out.print(matrix[StartRow][j] + " ");
        }

        //Right Boundary
        for(int i = StartRow+1;i<=EndRow;i++)
        {
            System.out.print(matrix[i][EndCol] +" ");
        }

        //Bottom Boundary
        for(int j=EndCol-1;j>=StartCol;j--)
        {
            if(StartCol==EndCol)
            {
                break;
            }
            System.out.print(matrix[EndRow][j]+" ");
        }

        //Left Boundary
        for(int i=EndRow-1; i>= StartRow+1 ;i--)
        {
            if(StartRow==EndRow)
            {
                break;
            }
            System.out.print(matrix[i][StartCol] + " ");
        }
        StartCol++;
        StartRow++;
        EndCol--;
        EndRow--;
    }

    }

    public static void main(String args[] ) {
        int matrix [] [] = { {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16} };
        System.out.print("Spiral Matrix is : ");
        printspiral(matrix);
    }
}
