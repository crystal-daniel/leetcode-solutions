import java.util.*;
public class Solution {
	public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int n = temperatures.length;
        int [] res = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && temperatures[i] >= temperatures[s.peek()])
            {
                s.pop();
            }
            if(!s.isEmpty())
            {
                res[i] = s.peek() - i;
            }
            s.push(i);
        }
        return res;
    }
	public static void main(String[] args) {
		int [] temperatures = {73,74,75,71,69,72,76,73};
		System.out.print(Arrays.toString(dailyTemperatures(temperatures)));
	}
}