import java.util.Arrays;

public class Solution {
	public static int[] shuffle(int[] nums, int n) {
        int [] result = new int[2*n];
        int k = 0;
        for(int i=0;i<n;i++)
        {
            result[k++]=nums[i];
            result[k++]=nums[n+i];
        }
        return result;
    }
	public static void main(String[] args) {
		int [] nums = {2,5,1,3,4,7};
		int n = 3;
		System.out.println(Arrays.toString(shuffle(nums, n)));
	}
}
