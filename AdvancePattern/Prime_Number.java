package AdvancePattern;
public class Prime_Number {
    // public static boolean IsPrime(int n) {
    //     boolean IsPrime = true;

    //     if(n==2)
    //     {
    //         return true;
    //     }

    //     for (int i = 2 ; i <= n-1 ; i++) {
    //         if(n % i == 0) {
    //             IsPrime = false;
    //             break;
    //         }
    //     }
    //     return IsPrime;
    // }
    

                    //optimized code
        // this function is for to check the given number is prime or not
public static boolean IsPrime(int n ) {

    if(n == 2)
    {
        return true;
    }

    for(int i = 2 ; i<= Math.sqrt(n); i++)
    {
        if( n%i == 0)
        {
            return false;
        }
    }
    return true;
}

                //This Function is to give input that is print the prime numbers in the given range

public static void PrimeInRange (int n) {
    for (int i = 2 ; i<= n ; i++) {
        if(IsPrime(i)) {
            System.out.print(i + " ");
        }
    }
}
    public static void main (String args[]) {
        PrimeInRange(20);
    }
}