import java.util.*;
public class Solution {
	public static double minimumAverage(int[] nums) {
	       Arrays.sort(nums);
	       int l = 0;
	       int h = nums.length - 1;
	       double [] average = new double[nums.length/2];
	       while(l<h)
	       {
	            average[l] = (double)((nums[l] + nums[h]) / 2.0);
	            l++;
	            h--;
	       } 
	       double minElement = average[0];
	       for(int i=l-1;i>=0;i--)
	       {
	            minElement = Math.min(minElement, average[i]);
	       }
	       return minElement;
	    }
	public static void main(String[] args) {
		int [] nums = {7,8,3,4,15,13,4,1};
		System.out.println(minimumAverage(nums));
	}
}