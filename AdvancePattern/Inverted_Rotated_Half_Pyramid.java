package AdvancePattern;
public class Inverted_Rotated_Half_Pyramid {
    public static void inverted_rotated_half_pyramid(int n) {
            // Outer loop
        for(int i = 1 ; i<= n ; i++)
        {

            //print spaces

            for(int j = 1 ; j<= (n-i) ; j++ )
            {
                    System.out.print(" ");
            }

            //print stars

            for(int k= 1 ; k<= i ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String args[]) {
        inverted_rotated_half_pyramid(5);
    }
}
