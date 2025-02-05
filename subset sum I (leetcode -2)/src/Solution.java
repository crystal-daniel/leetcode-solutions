import java.util.*;
public class Solution {
	List<Integer> res = new ArrayList<>();
	void calculateSubsetSum(int [] nums, int index, int sum)
	{
		if(index>=nums.length)
		{
			res.add(sum);
			return;
		}
		calculateSubsetSum(nums, index+1, sum+nums[index]);
		calculateSubsetSum(nums, index+1, sum);
		Collections.sort(res);
	}
	public static void main(String[] args) {
		int [] nums = {3,1,2};
		Solution obj = new Solution();
		obj.calculateSubsetSum(nums, 0, 0);
		System.out.print(obj.res);
	}
}