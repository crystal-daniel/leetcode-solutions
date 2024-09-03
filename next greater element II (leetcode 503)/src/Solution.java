import java.util.*;
public class Solution {
	public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int [] res = new int[n];
        for(int i=2*n-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()<=nums[i%n])
            {
                s.pop();
            }
            if(i<n)
            {
                if(s.isEmpty())
                {
                    res[i] = -1;
                }
                else
                {
                    res[i] = s.peek();
                }
            }
            s.push(nums[i%n]);
        }
        return res;
    }
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,3};
		System.out.print(Arrays.toString(nextGreaterElements(nums)));
	}
}