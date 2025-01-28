package AdvancePattern;
public class Hollow_Rhombus {
    public static void hollow_rhombus(int n ) {
        //outer loop

        for (int i = 1 ; i<= n ; i++)
        {
                //spaces

                for(int j = 1 ; j<= (n-i) ; j++)
                {
                    System.out.print(" ");
                }

                //Hollow Rectangle

                for (int k = 1 ; k<= n ; k++)
                {
                    if(i == 1 || i == n || k == 1|| k== n)
                    {
                        System.out.print("*");
                    }

                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
        }
    }
    public static void main (String args []) {
        hollow_rhombus(4);
    }
}
