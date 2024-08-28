import java.util.*;
public class Solution {
	public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String operators = "+-*/";
        for(String s: tokens)
        {
            if(!operators.contains(s))
            {
                stack.push(Integer.valueOf(s));
            }
            else
            {
                int b = stack.pop();
                int a = stack.pop();
                if(s.equals("+"))
                {
                    stack.push(a + b);
                }
                else if(s.equals("-"))
                {
                    stack.push(a - b);
                }
                else if(s.equals("*"))
                {
                    stack.push(a * b);
                }
                else
                {
                    stack.push(a / b);
                }
            }
        }
        return stack.peek();
    }
	public static void main(String[] args) {
		String [] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		System.out.println(evalRPN(tokens));
	}
}