package stack;
import java.util.ArrayList;
public class Stack_Arraylist {

    static class Stack {

        //Implementation Using ArrayList
        static ArrayList<Integer> list = new ArrayList<>();

        //Function to check stack is Empty or not
        public static Boolean IsEmpty()
        {
            return list.isEmpty();                      //We can Write this thing "return list.size() == 0;"
        }

        //Function to add element(Push) in stack
        public static void push(int data)
        {
            list.add(data);
        }

        //Function to delete Element (Pop) in stack
        public static int pop()
        {
            //For Edge Cases
            if (list.isEmpty())
            {
                return -1;
            }
            
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //Function for show the peek element in stack
        public static int peek() {
            //For Edge Cases
            if (list.isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.IsEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
