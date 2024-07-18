import java.util.Arrays;

public class Solution {
	public static int[] productExceptSelf(int[] nums) {
        int prod = 1, prodZero = 1, count = 0;
        for(int n: nums)
        {
            if(n==0)
            {
                prod *= n;
                count++;
            }
            else
            {
                prod *= n;
                prodZero *= n;
            }
        }
        int [] res = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0 && count == 1)
            {
                res[i] = prodZero;
            }
            else if(nums[i] == 0 && count>1)
            {
                res[i] = prod;
            }
            else
            {
                res[i] = prod/nums[i];
            }
        }
        return res;
    }
	public static void main(String[] args) {
		int [] nums = {-1,1,0,-3,3};
		System.out.print(Arrays.toString(productExceptSelf(nums)));
	}
}