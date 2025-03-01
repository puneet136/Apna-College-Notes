package array;
public class MaxSubArraySum {
                //Brute Force//
                //Time Complexity will be O(n^3) In this brute force method
    public static void maxsubarraysum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        
        for(int i = 0 ; i<numbers.length ; i++)
        {
            int start = i;
            for(int j = i ; j< numbers.length ; j++)
            {
                int end = j;
                int CurrSum = 0;
                for(int k = start ; k<=end ; k++)
                {
                    //Sub Array Sum
                    System.out.print(numbers[k] + " ");
                    CurrSum += numbers[k];
                }

                System.out.println("Sum is : " +CurrSum);
                if(maxSum < CurrSum)
                {
                    maxSum = CurrSum;
                }
            }
        }
        System.out.println("Maximum Sum is  : " +maxSum);

        
    }
            public static void main (String args[]) {
                int numbers [] = {2, 4, 6, 8, 10};
                maxsubarraysum(numbers);
            }
}
