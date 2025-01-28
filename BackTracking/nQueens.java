package BackTracking;
public class nQueens {

    public static boolean isSafe(char board [][] , int row, int col){
        //Vertical Up
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }
        //Diagonally  left Up
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        //Diagonally Right Up
        for(int i = row-1 , j = col+1 ;i>=0 && j<board.length ;i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        return true;
    }
    public static boolean Nqueens(char[][] board , int row){
        //Base Case
        if(row == board.length)
        {
            //If we want to print all the solutions of N queens then Comment in this following line print(board)
            // print(board);

            //If we want to count all the ways of N queens then this is the operation
            count++;
            return true;
        }

        //Column Loop
        for(int j=0;j<board.length;j++)
        {
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(Nqueens(board, row+1)){
                    return true;
                }
                
                board[row][j] = 'x';
            }
        }
        return false;
    }
    public static void print(char board[][])
    {
        System.out.println("------" +"Chess Board" +"-------");
        for (char[] board1 : board)
        {
            {
                for (int j = 0; j<board.length; j++)
                {
                    System.out.print(board1[j] + " ");
                }
            }
            System.out.println();
        }
    }

    static int count = 0;
    public static void main(String[] args) {
        int n  = 4;
        char board [][] = new char[n][n];
        for(int i = 0 ;i<n ;i++)
        {
            for(int j = 0;j<n;j++)
            {
                board[i][j] = 'x';
            }
        }
        if(Nqueens(board, 0)){
            System.out.println("Solution Is possible!!");
            print(board);
        }
        else{
            System.out.println("Soluton is Not Possible!!");
        }

        // System.out.println("Total no. of ways to solve n Queens = " + count);
    }
}