import java.util.Arrays;

public class Solution {
	public static int[] leftRightDifference(int[] nums) {
        int [] answer = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            answer[i] = Math.abs(sum(0,i-1,nums)-sum(i+1,nums.length-1,nums));
        }
        return answer;
    }
    static int sum(int start, int end, int [] nums)
    {
        int sum = 0;
        for(int i=start;i<=end;i++)
        {
            sum+=nums[i];
        }
        return sum;
    }
	public static void main(String[] args) {
		int [] nums = {10,4,8,3};
		System.out.print(Arrays.toString(leftRightDifference(nums)));
	}
}
