package array;

public class Binary_Search {

    public static int binarySearch(int numbers [] ,int key)
    {
        int start = 0 ; int end = numbers.length-1;
            while (start <= end)
            {
                    int mid = (start+end) / 2;
            
                    //Comparison
                if(numbers[mid] == key)
                {
                    return mid;
                }
                else if(numbers[mid] < key)                      //Right Side Condition
                {
                    start = mid +1;
                }
                else                                             //Left Side Condition
                {
                    end = mid -1;
                }
            }
            return -1;
    }
    public static void main (String [] args) {
        int numbers [] = {2, 6, 8, 4, 12, 45};
        java.util.Arrays.sort(numbers);
        int key = 6;

        System.out.println("Index For Key at = " + binarySearch(numbers, key));
    }
}
