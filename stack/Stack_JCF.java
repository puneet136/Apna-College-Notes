package stack;
import java.util.*;
public class Stack_JCF {

    //This Function is Implemented data in stack at bottom
    public static void pushAtBottom(Stack<Integer> s , int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String ReverseString(String str){
        Stack<Character> st = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            st.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!st.isEmpty()){
            char curr = st.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

    s.push(1);
    s.push(2);
    s.push(3);

    pushAtBottom(s , 4);
    
    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }

    String str = "puneet";
    String result = ReverseString(str);
    System.out.println(result);
    }
}
