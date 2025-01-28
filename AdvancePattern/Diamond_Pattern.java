package AdvancePattern;
public class Diamond_Pattern {
    public static void diamond_pattern(int n) {
        //1st Half
        for(int i = 1 ; i<= n ; i++)
        {
            //Inner Loop --> Spaces

            for (int j = 1 ; j<= (n-i) ; j++)
            {
                System.out.print(" ");
            }

            //Stars
                for(int k = 1 ; k<= (2*i-1) ; k++)
                {
                    System.out.print("*");
                }
            System.out.println();
        }

        //2nd Half

        for(int i = n ; i>= 1 ;i--) {
            for (int j = 1 ; j<= (n-i) ; j++)
            {
                System.out.print(" ");
            }

            //Stars
                for(int k = 1 ; k<= (2*i-1) ; k++)
                {
                    System.out.print("*");
                }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond_pattern(5);
    }
}
