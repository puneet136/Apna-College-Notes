package stack;
import java.util.*;
public class Valid_Parentheses {
    public static boolean isValid(String str){
        Stack <Character> s = new Stack <>();

        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);

            //Checking opening Condition
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }

            else{
                //Check the stack is empty or not
                if(s.isEmpty()){
                    return false;
                }

                //checking pair condition
                if((s.peek() == '(' && ch == ')')
                ||( s.peek() == '{' && ch == '}')
                ||( s.peek() == '[' && ch == ']')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        String str = "({({[{)()]})})";
        System.out.println(isValid(str));
    }
}
