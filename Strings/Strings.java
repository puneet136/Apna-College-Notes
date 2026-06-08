package Strings;
public class Strings
{
    public static void PrintLetter(String str)
    {
            for(int i = 0 ; i<str.length(); i++)
            {
                System.out.println(str.charAt(i));
            }
    }

                    //Check String is Palindrome or Not
    public static boolean IsPalindrome(String str)
    {
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)==str.charAt(str.length()-i-1))
            {
                return true;
            }
        }
        return false;
    }
                    //Get the Shortest Path
    public static float getShortestPath (String path) {
        int x=0,y=0;
        for(int i=0 ; i<path.length();i++)
        {
            char dir = path.charAt(i);

            //North
            switch (dir) {
                case 'N' -> y++;
                case 'W' -> x--;
                case 'S' -> y--;
                default -> x++;
            }
            //West
            //South
            //East
        }
        int X2= x*x;
        int Y2 = y*y;
        return  (float)Math.sqrt(Y2+X2 );
    }

    public static String Substring(String str , int si , int ei)
    {
        String substr="";
        for(int i=si;i<ei;i++)
        {
                substr += str.charAt(i);
        }
        return substr;
    }

    public static void largeststring(String fruits [])
    {
            String largest = fruits[0];

        for (String fruit : fruits) {
            if (largest.compareToIgnoreCase(fruit) < 0)
            {
                largest = fruit;
            }
        }
        System.out.print(largest);
    }

    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1 ; i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;

                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }

    public static String StringCompression(String str)
    {
                    //By using the help of String

        // String Newstr = "";
        // for(int i=0; i<str.length();i++)
        // {
        //     Integer count = 1;
        //     while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
        //     {
        //         count++;
        //         i++;
        //     }
        //     Newstr += str.charAt(i);

        //     if(count>1)
        //     {
        //         Newstr += count.toString();
        //     }
        // }
        // return Newstr;

                //By Using the help of String Builder

        StringBuilder NewStr = new StringBuilder();
        for(int i=0; i<str.length();i++)
        {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }

            NewStr.append(str.charAt(i));
            if(count>1){
                NewStr.append(count.toString());
            }
        
    }
    return NewStr.toString();
}
    public static void main(String args[])
    {
        String str = "abcd";
        System.out.println(StringCompression(str));
    }
}
