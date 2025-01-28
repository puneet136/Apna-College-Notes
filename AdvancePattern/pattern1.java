package AdvancePattern;
// public class pattern1 {
//     public static void main(String[] args) {
//         for(int i = 4 ; i>=1 ; i--) {
//             for (int j = 1 ; j<=i ; j++ ) {
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

                //Half Pyramid Triangle

// public class pattern1 {      
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1 ; i<=n ; i++) {
//                 for (int j = 1 ; j<= i ;j++) {
//                     System.out.print(j);
//                 }
//                 System.out.println();
//         }
//     }
// }


                // Print character Pattern
public class pattern1 {
    
    public static void character ()
    {
        char ch = 'A';
        for (int i = 1 ; i<=4; i++)
        {
            for (int j = 1 ; j<=i ; j++)
            {
                System.out.print( ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void palindromicPatternWithnums(int n) {
        //Outer loop
        for(int i = 1 ; i<= n ; i++)
        {
            //Inner loop --> Spaces

            for (int j = 1 ; j<= (n-i) ; j++)
            {
                System.out.print(" ");
            }

            //descending

            for(int j = i ; j>= 1 ; j--)
            {
                System.out.print(j);
            }

            //Ascending

            for(int j = 2 ; j<= i ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Number_Pattern(int n) {
        //Outer Loop

        for(int i = 1 ; i<= n ; i++) {

            //Spaces

            for (int j = 1 ; j<=(n-i) ; j++)
            {
                    System.out.print(" ");
            }

            for(int j =1 ; j<=i ; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main (String [] arg) {
        // character();
        // palindromicPatternWithnums(6);
            Number_Pattern(5);
    }
}