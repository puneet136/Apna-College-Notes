package BackTracking;
public class Grid_Maths {
    public static int GridMaths(int n){

        if(n==0){
            return 1;
        }
        int fnm1 = GridMaths(n-1);
        int fn = n*fnm1;
        return fn;
    }
    public static void main (String [] args){
        int n=3,m=3;
        int result = GridMaths(n-1+m-1)/(GridMaths(n-1) * GridMaths(m-1));
        System.out.println(result);
    }
}

//Time Complexity of this problem is:- O(n+m)