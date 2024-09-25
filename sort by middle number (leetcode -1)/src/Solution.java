import java.util.Arrays;

public class Solution {
	static int[] sortMaadi(int [] nums)
	{
		int midIndex = nums.length/2;
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=0;j<nums.length-i-1;j++)
			{
				int mid1 = (nums[j]/(int)Math.pow(10, midIndex))%10;
				int mid2 = (nums[j+1]/(int)Math.pow(10, midIndex))%10;
				if(mid1==mid2)
				{
					if(nums[j+1]<nums[j])
					{
						int temp = nums[j];
						nums[j] = nums[j+1];
						nums[j+1] = temp;
					}
				}
				else if(mid2<mid1)
				{
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		int [] nums= {74387,57983,67262,54295,74635};
		System.out.println(Arrays.toString(sortMaadi(nums)));
	}
}