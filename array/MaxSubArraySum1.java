package array;
public class MaxSubArraySum1 {

                //Prefix Method

    public static void prefixsum(int numbers[])
    {
        int currSum;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
            //Calculate Prefix Array
        for(int i = 1 ; i<numbers.length ; i++)
        {
            prefix[i] = prefix [i-1]+numbers[i];
        }

        for(int i = 0 ;i<numbers.length ;i++)
        {
            int start = i;
            for(int  j = i ; j< numbers.length ; j++)
            {
                int end = j;
                                            //Ternary Operator
                currSum = start ==  0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxsum<currSum)
                {
                    maxsum = currSum;
                }
            }
        }
            System.out.println("Maximum sum is :" +maxsum);
    }

                            //KADANE'S Algoritham

    public static void kadanes(int numbers1[])
    {
            int ms = Integer.MIN_VALUE;
            int cs = 0;

            for(int i= 0 ; i<numbers1.length ;i++)
            {
                cs = cs + numbers1[i];
                if(cs <0)
                {
                    cs = 0;
                }
                ms = Math.max(cs, ms);
            }
            System.out.println("Max sum is : "+ms);
    }
    public static void main (String args[])
    {
        // int numbers [] = {1, -2, 6, -1, 3};
        int numbers1 [] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers1);
    }
}
