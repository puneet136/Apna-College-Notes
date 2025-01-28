package array;
public class Largest_Number_Array {
    public static int GetLargest(int numbers [])
    {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0 ; i<numbers.length;i++) {
            if(largest < numbers[i])
            {
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest Number is " + smallest);
        return largest;
    }

    public static void main (String args[])
    {
            int numbers[] = {1,4,8,5,9};
            System.out.println("Largest Value is " + GetLargest(numbers));
    }
}
