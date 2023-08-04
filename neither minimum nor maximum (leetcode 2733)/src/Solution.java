import java.util.*;
public class Solution {
	public static int findNonMinOrMax(int[] nums) {
        if(nums.length<=2)
            return -1;
        Arrays.sort(nums);
            return nums[1];
    }
	public static void main(String[] args) {
		int [] nums = {2,3,1};
		System.out.println(findNonMinOrMax(nums));
	}
}
