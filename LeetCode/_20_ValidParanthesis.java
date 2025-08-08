import java.util.Stack;

public class _20_ValidParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();

        for(char it : s.toCharArray()){
            if (it == '(' || it == '[' || it == '{')
                // if any open bracket found, push it to stack.
                st.push(it);
            else{
                // if any closing bracket are present, first check whether stack is empty or not, if it's empty then return false.
                if(st.isEmpty())    
                    return false;

                // if stack is not empty then, pop out top element & compare with it's corresponding bracket
                char ch = st.pop();
            
                // comparisions of brackets
                if(( it == ')' && ch == '(') || (it == '}' && ch == '{') || (it == ']' && ch == '['))
                    continue;
                else{
                    // if comparision fails, then return false
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({}){[]}";

        System.out.println(isValid(str));
        
    }
}
