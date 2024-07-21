public class Solution {
	static int [] nums = {0,1,2,2,3,0,4,2};
	public static int removeElement(int[] nums, int val) {
		int k = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
	public static void main(String[] args) {
		int val = 2;
		int k = removeElement(nums, val);
		System.out.println(k);
		for(int i=0;i<k;i++)
		{
			System.out.print(nums[i] + " ");
		}
	}
}