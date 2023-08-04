import java.util.Arrays;

public class Solution {
	public static int[] sortArrayByParityII(int[] nums) {
        int a[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                a[j]=nums[i];
                j+=2;
            }
        }
        j=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                a[j]=nums[i];
                j+=2;
            }
        }
        return a;
    }
	public static void main(String[] args) {
		int [] nums = {4,2,5,7};
		System.out.println(Arrays.toString(sortArrayByParityII(nums)));
	}
}
