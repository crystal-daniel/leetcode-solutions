public class Solution {
	public static int minimumOperations(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%3!=0)
                count++;
        }
        return count;
    }
	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		System.out.println(minimumOperations(nums));
	}
}