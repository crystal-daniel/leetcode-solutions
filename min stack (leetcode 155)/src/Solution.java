import java.util.*;
public class Solution {
	Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || minStack.peek()>=val)
        {
            minStack.push(val);
        }
    }
    
    public void pop() {
        int val = stack.pop();
        if(minStack.peek().equals(val))
        {
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
	public static void main(String[] args) {
		Solution obj = new Solution();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);
		System.out.println(obj.getMin());
		obj.pop();
		System.out.println(obj.top());
		System.out.println(obj.getMin()); 
	}
}