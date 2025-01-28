package BackTracking;
public class Find_Subsets {
    public static void findsubset(String str, String ans , int i){
        if(i==str.length())
        {
            if(ans.length()==0)
            {
                System.out.print("null");
            }
            else
            {
                System.out.println(ans);
            }
            return;
        }
        //Yes Choice
        findsubset(str, ans+str.charAt(i), i+1);
        //No Choice
        findsubset(str, ans, i+1);
    }
    public static void main (String[]args){
        String str = "abc";
        findsubset(str,"",0);
    }
}
