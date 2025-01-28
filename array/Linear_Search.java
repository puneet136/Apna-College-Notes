package array;
public class Linear_Search{
    // public static int linearSearch(int numbers [] , int key) {

    //     for(int i = 0 ; i<numbers.length ; i++)
    //     {

    //         if(numbers[i] == key)
    //         {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static void main (String args[]) {
    //         int numbers [] = {2,4,6,8,10,12,14};
    //         int key = 10;

    //         int index= linearSearch(numbers, key);

    //         if(index == -1)
    //         {
    //             System.out.println("NOT FOUND!");
    //         }
    //         else
    //         {
    //             System.out.print("Key is at Index " + index);
    //         }
    // }

    public static int linearsearch (String Menu[] , String key) {
            for(int i = 0 ; i< Menu.length ; i++)
            {
                if(Menu[i].equals(key))
                {
                    return i;
                }
            }
            return -1;
    }

    public static void main (String args[]) {
        String Menu [] = {"Samosa" , "Chole Bhature" , "Idli"};
        String key = "Idli";

        int index = linearsearch(Menu, key);

        if(index == -1)
        {
            System.out.println("NOT found!");
        }
        else
        {
            System.out.println("Key is At Index = " +index);
        }
    }
}