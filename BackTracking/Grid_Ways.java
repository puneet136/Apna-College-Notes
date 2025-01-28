package BackTracking;
public class Grid_Ways{

    public static int GridWays(int i , int j , int n , int m)
    {
        //Base Condition
        if(i == n-1 && j == m-1){       //Condition For Last Cell
            return 1;
        }
        else if(i == n || j == m){      //For Boundary Cross Condition
            return 0;
        }
        //For the Choice of Right
        int w1 = GridWays(i, j+1, n, m);
        //For the Choice Of Down
        int w2 =GridWays(i+1 , j , n, m);

        return w1 + w2;
    }
    public static void main(String [] args) {
        int n = 2 , m = 2;
        System.out.println(GridWays(0,0,n,m));
    }
}

 //Time Complexity of this problem is Exponentially because to every move have two choices (Down And right) and the total no. of cells is (n+m) so that the overall time complexity of this problem is  :- O(pow(2,n+m))