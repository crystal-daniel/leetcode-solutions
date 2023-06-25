import java.util.Arrays;

public class Solution {
	public static int[] twoSum(int[] nums, int target) {
        int [] b=new int[2];
        for(int i=0;i<nums.length-1;i++)
        {
            int a=target-nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==a)
                {
                    b[0]=i;
                    b[1]=j;
                }
            }
        }
        return b;
    }
	public static void main(String[] args) {
		int [] nums = {2,7,11,15};
		int target = 9;
		int [] ans = twoSum(nums,target);
		System.out.println(Arrays.toString(ans));
	}
}
