import java.util.*;
public class Solution {
	 List<List<Integer>> answer = new ArrayList<>();
	    void findSubsets(int[] nums, int index, List<Integer> res)
	    {
	        answer.add(new ArrayList<>(res));
	        for(int i=index;i<nums.length;i++)
	        {
	            if(i>index && nums[i]==nums[i-1])
	            {
	                continue;
	            }
	            res.add(nums[i]);
	            findSubsets(nums, i+1, res);
	            res.remove(res.size()-1);
	        }
	    }
	    public List<List<Integer>> subsetsWithDup(int[] nums) {
	        List<Integer> res = new ArrayList<>();
	        Arrays.sort(nums);
	        findSubsets(nums, 0, res);
	        return answer;
	    }
	public static void main(String[] args) {
		int [] nums = {1,2,2};
		Solution obj = new Solution();
		System.out.print(obj.subsetsWithDup(nums));
	}
}