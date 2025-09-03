package Recursion;
public class Recursion{
    public static void PrintDec(int n)
    {
        if(n == 1)
        {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
    }

    public static void PrintInc(int n){
        if(n == 10)
        {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n + " ");
        PrintInc(n+1);
    }

    public static int fact(int n){
        if(n==0)
        {
            return 1;
        }
        int fnm1 = fact(n-1);
        return n * fnm1;
    }

    public static int PrintSum(int n){
        if(n==1){
            return 1;
        }
        int pnm1= PrintSum(n-1);
        return n+pnm1;
    }

    public static int Fib(int n){
        if(n==1)
        {
            return 1;
        }
        if(n==0)
        {
            return 0;
        }
        int fibnm1 = Fib(n-1);
        int fibnm2 = Fib(n-2);
        return fibnm1 + fibnm2;
    }

    public static boolean IsSorted(int[] arr, int i){
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return IsSorted(arr, i+1);
    }

    public static int FirstOccurrence(int [] arr, int key , int i){
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return FirstOccurrence(arr, key, i+1);
    }

    public static int LastOccurrence (int[] arr, int key , int i)
    {
        if(i==arr.length-1)
        {
            return -1;
        }
        int isfound = LastOccurrence(arr, key, i+1);
        if(isfound == -1 && arr[i]==key)
        {
            return i;
        }
        return isfound;
    }

    public static int power (int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1 = power(x,n-1);
        return x * xnm1;
    }

    public static int OptimizedPower(int a , int n)
    {
        if(n == 0)
        {
            return 1;
        }
        int HalfPower = OptimizedPower(a, n/2);
        int HalfPowerSq = HalfPower * HalfPower;

        if((n%2) != 0 )
        {
            HalfPowerSq = a * HalfPower;
        }
        return HalfPowerSq;
    }

    public static int tilingProblem(int n){
        //Base Case
        if(n==0 || n==1)
        {
            return 1;
        }

        //Vertical Choices
        int fnm1 = tilingProblem(n-1);

        //Horizontal Choices
        int fnm2 = tilingProblem(n-2);

        return fnm1 + fnm2;
    }

    public static void BinaryString(int n, int lastplace , String str){
                           //Base Condition
        if(n == 0)
        {
            System.out.println(str);
            return;
        }

        BinaryString(n-1, 0, str+"0");

        if(lastplace == 0)
        {
            BinaryString(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args)
    {
        BinaryString(4, 0, "");
    }

}
