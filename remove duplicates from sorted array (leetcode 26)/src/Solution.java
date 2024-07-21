import java.util.*;
public class Solution {
	public static int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int k = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(!list.contains(nums[i]))
            {
                nums[k++] = nums[i];
                list.add(nums[i]);
            }
        }
        return k;
    }
	public static void main(String[] args) {
		int [] nums = {0,0,1,1,1,2,2,3,3,4};
		int k = removeDuplicates(nums);
		System.out.println(k);
		for(int i=0;i<k;i++)
		{
			System.out.print(nums[i]+" ");
		}
	}
}