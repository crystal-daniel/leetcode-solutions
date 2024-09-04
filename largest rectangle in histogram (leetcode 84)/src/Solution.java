import java.util.*;
public class Solution {
	public int largestRectangleArea(int[] heights) {
        int max = 0;
        int ps[] = prevSmaller(heights);
        int ns[] = nextSmaller(heights);
        for(int i=0;i<heights.length;i++)
        {
            int area = (ns[i] - ps[i] - 1) * heights[i];
            max = Math.max(area, max);
        }
        return max;
    }
    int[] prevSmaller(int [] heights)
    {
        int [] res = new int[heights.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<heights.length;i++)
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                res[i] = -1;
            }
            else
            {
                res[i] = s.peek();
            }
            s.push(i);
        }
        return res;
    }
    int[] nextSmaller(int [] heights)
    {
        int [] res = new int[heights.length];
        Stack<Integer> s = new Stack<>();
        for(int i=heights.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                res[i] = heights.length;
            }
            else
            {
                res[i] = s.peek();
            }
            s.push(i);
        }
        return res;
    }
	public static void main(String[] args) {
		Solution obj = new Solution();
		int [] heights = {2,1,5,6,2,3};
		System.out.print(obj.largestRectangleArea(heights));
	}
}