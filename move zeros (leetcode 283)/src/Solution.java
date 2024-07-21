import java.util.Arrays;

public class Solution {
	public static void moveZeroes(int[] nums) {
        int k = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[k++] = nums[i];
            }
        }
        for(int i=nums.length-1; i>=k;i--)
        {
            nums[i] = 0;
        }
    }
	public static void main(String[] args) {
		int [] nums = {0,1,0,3,12};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
}