import java.util.Arrays;

public class Solution {
	public static int[] sortArrayByParity(int[] nums) {
        int a[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
                a[j++]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
                a[j++]=nums[i];
        }
        return a;
    }
	public static void main(String[] args) {
		int [] nums = {3,1,2,4};
		System.out.println(Arrays.toString(sortArrayByParity(nums)));
	}
}
