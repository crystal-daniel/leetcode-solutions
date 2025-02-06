import java.util.*;
public class Solution {
	List<List<Integer>> answer = new ArrayList<>();
	//Approach 1 - using a map array
    void findPermutations(int[] nums, List<Integer> res, boolean[] used)
    {
        if(res.size()==nums.length)
        {
            answer.add(new ArrayList<>(res));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!used[i])
            {
                used[i] = true;
                res.add(nums[i]);
                findPermutations(nums, res, used);
                used[i] = false;
                res.remove(res.size()-1);
            }
        } 
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        
        findPermutations(nums, res, used);
        return answer;
    }
	public static void main(String[] args) {
		int []nums = {1,2,3};
		Solution obj = new Solution();
		System.out.println(obj.permute(nums));
	}
}