package stack;

import java.util.Stack;

public class Duplicate_paranthesis{

        //Approach 1
    // public static boolean IsDuplicate(String str){
    //     Stack<Character> s = new Stack<>();

    //     for(int i =0;i<str.length() ; i++){
    //         char ch = str.charAt(i);

    //         //Closing
    //         if(ch == ')'){
    //             int count = 0;
    //             while(s.peek() != '('){
    //                 s.pop();
    //                 count++;
    //             }
    //             if(count <1){
    //                 return true;    //Duplicate
    //             }
    //             else{
    //                 s.pop();        //Opening Pair
    //             }
    //         }
    //         else{
    //             //Opening condition
    //             s.push(ch);
    //         }

    //     }
    //     return false;
    // }

            //Approach 2
        
        public static boolean IsDuplicate(String str){
            Stack<Character> stack = new Stack<>();

            for (int i=0;i<str.length() ;i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                // Check if the top of the stack is '(' (which means duplicate parentheses)

                if (stack.peek() == '('){
                    return true; // Found duplicate parentheses
                }
                
                // Pop elements until '(' is found
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                }

                // Pop the '('
                stack.pop();
            } else {
                stack.push(ch); // Push all other characters
            }
        }

        return false; //
        }
        
    public static void main(String[] args) {
        //Valid String
        String str1 = "((a+b)+(c+d))";          //Output :- false
        String str2 = "((a-b))";        //Output :- true
        System.out.println(IsDuplicate(str2));
        System.out.println(IsDuplicate(str1));
    }
}