public class BitManipulation {
    public static void EvenOrOdd(int n)
    {
        int bitmask = 1;

        if((n & bitmask) == 0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }

    public static int getBit(int n , int i)
    {
        if((n&(1<<i))==0)
        {
                return 0;
        }
        else
        {
            return 1;
        }
    }

    public static int setBit(int n , int i)
    {
        int bitmask = (1<<i);

        return n|bitmask;
    }

    public static int clearBit(int n , int i)
    {
        int bitmask = ~(1<<i);

        return n&bitmask;
    }
    public static int updatebit(int n , int bit , int pos)
    {
        int clear = ~(1<<pos);
        int bitmask = n&clear;

        return bitmask|(bit<<pos);
    }

    public static int clearlastbits(int n , int i)
    {
        int bitmask = ~0<<i;
        int newdigit = n& bitmask;
        return newdigit;
    }

    public static int clearRangeBits(int n , int i, int j)
    {
        int a = ~0<<(j+1);
        int b = (1<<i)-1;

        int bitmask = a | b;
        return n & bitmask;
    }

    public static boolean isPowerOfTwo(int n)
    {
        return (n&(n-1)) == 0;
    }
                            //AMAZON AND GOOGLE
    public static int CountSetBits(int n)
        {
        int count = 0;
        while (n>0)
        {
            if((n&1) != 0)          //CHECK LSB
            {
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int FastExponention(int x , int n){
        int ans = 1;
        while (n>0)
        {
        if((n&1)!= 0)
        {
            ans = ans * x;
            n--;
        }
        else
        {
            n = n>>1;       // n = n>>1 Is basically n = n/2
            x = x*x;
        }
    }

        return ans;
    }
    public static void main(String [] args){
        // EvenOrOdd(12);
        // System.out.println(getBit(10, 3));
        // System.out.println(setBit(10, 2));
        // System.out.println(clearBit(8, 3));
        // System.out.println(updatebit(25, 1, 2));
        // System.out.println(clearlastbits(15, 2));
        // System.out.println(clearRangeBits(2514, 2, 7));
        // System.out.println(isPowerOfTwo(16));
        // System.out.println(CountSetBits(15));
        System.out.print(FastExponention(5, 2));
    }
}