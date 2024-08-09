import java.util.*;
public class Solution {
	public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()%2!=0) return false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='{')
            {
                stack.push('}');
            }
            else if(s.charAt(i)=='[')
            {
                stack.push(']');
            }
            else if(s.charAt(i)=='(')
            {
                stack.push(')');
            }
            else
            {
                if(stack.empty() || s.charAt(i)!=stack.peek())
                {
                    return false;
                }
                else
                {
                    stack.pop();
                }
            }
        }
        if(!stack.empty())
        {
            return false;
        }
        return true;
    }
	public static void main(String[] args) {
		String  s = "()[]{}";
		System.out.println(isValid(s));
	}
}