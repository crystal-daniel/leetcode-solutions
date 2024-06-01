import java.util.Arrays;

public class Solution {
	public static int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int [] ans = new int[2*l];
        for(int i = 0; i<l; i++)
        {
            ans[i] = ans[i+l] = nums[i];
        }
        return ans;
    }
	public static void main(String[] args) {
		int [] nums = {1,2,3};
		System.out.println(Arrays.toString(getConcatenation(nums)));
	}
}
