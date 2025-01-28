package AdvancePattern;
public class Binomial_Coefficient {

    public static int factorial(int n)
    {
        int f = 1;

        for (int i = 1 ; i<= n ; i++)
        {
            f = f*i;
        }
        return f;
    }
    public static int binCoff (int n , int r)
    {
            int fac_n = factorial(n);
            int fac_r  = factorial(r);
            int fac_nmr = factorial(n-r);

            int binCoff = fac_n/((fac_r ) * fac_nmr);
            return binCoff;
    }

    public static void main(String[] args) {
        System.out.println(binCoff(5, 2));
    }
}