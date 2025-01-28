package AdvancePattern;
public class Inverted_Half_Pyramid_Numbers
{
    public static void inverted_half_pyramid_numbers(int n)
    {
        for(int i = n; i>= 1 ; i--)
        {

            for(int j = 1; j<=i ; j++)
            {
                System.out.print(j + " ");
            }

            System.out.println();

        }
    }
    public static void main (String args[] ) {
        inverted_half_pyramid_numbers(5);
    }
}
