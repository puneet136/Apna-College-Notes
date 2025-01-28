package BackTracking;
public class Backtracking_Array {

    public static void ChangeArr(int arr[], int i, int val)
    {
        //Base Case
        if(i==arr.length)
        {
            printArr(arr);
            return ;
        }

        //Recursion
        arr[i] = val;
        ChangeArr(arr, i+1, val+1);         //Function call Steping
        arr[i] = arr[i] - 2;                //BackTracking Step
    }
    public static void printArr(int arr[] )
    {
        for(int i = 0 ; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main (String [] args){
        int arr[] = new int[5];
        ChangeArr(arr, 0, 1);
        printArr(arr);
    }
}
