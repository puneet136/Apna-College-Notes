package array;
public class BasicSorting{
                        //T.c = O(n^2)
    public static void BubbleSort(int nums[])
    {
        //Outer Loop
        for(int turn = 1 ; turn <nums.length;turn++)
        {
            //Processing Element
            for(int j=0 ; j<nums.length-turn;j++)
            {
                if(nums[j]>nums[j+1] )
                {
                    //Swapping of Element
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }

                //This is the Optimized version of bubble sorting array and time complexity of this method is "O(n)" because no one swapping happened in this array then the inner loop is not iterating

    @SuppressWarnings("unused")
    static void optimizebubblesort(int nums[]){
            //Outer loop
        for(int i = 0 ; i<nums.length-1 ; i++)
        {
            int swap = 0 ;

            //Inner Loop
        for(int j = 0 ; j<nums.length-1 ; j++)
        {
            if(nums[j]>nums[j+1])
            {
                    int temp= nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap++;
            }
        }
        if(swap == 0 )
        {
            break;
        }
        }
    }
                    //T.C = O(n^2)
    public static void selectionsort(int nums[])
    {
        for(int i = 0; i<nums.length-1 ; i++)
        {
            int minpos = i;
                for(int j= i+1 ;j<nums.length;j++)
                {
                    if(nums[j]<= nums[minpos])
                    {
                        minpos = j;
                    }
                }

            //Swap
            int temp = nums[minpos];
            nums[minpos] = nums[i];
            nums[i] = temp;
        }
    }

                        //T.C :- O(n^2)
    public static void insertionsort(int nums[]) {
        for(int i = 1 ;i<nums.length;i++)
        {
            //This Declaration is important for store the first no comparing element in the temporary memory
            int temp = nums[i];
            int j = i-1;
            while(j>=0)
            {
                if(nums[j]<temp)
                {
                    nums[j+1] = nums[j];
                }
                else
                {
                    break;
                }
                j--;
            }
            nums[j+1] = temp;
        }
    }
    public static void printArray(int nums[])
    {
        for(int i = 0; i<nums.length ;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.print(" ");
    }
    public static void main(String args[])
    {
        int nums [] = {5, 4, 1, 3, 2};
        insertionsort(nums);
        printArray(nums);
    }
}