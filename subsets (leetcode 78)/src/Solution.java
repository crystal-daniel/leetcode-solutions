import java.util.*;
public class Solution {
	List<List<Integer>> answer = new ArrayList<>();
    void subsequence(int index, List<Integer> res, int [] nums)
    {
        if(index>=nums.length)
        {
            answer.add(new ArrayList<>(res));
            return;
        }
        res.add(nums[index]);
        subsequence(index+1, res, nums);
        res.remove(res.size()-1);
        subsequence(index+1, res, nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> res = new ArrayList<>();
        subsequence(0, res, nums);
        return answer;
    }
	public static void main(String[] args) {
		int [] nums = {1,2,3};
		Solution obj = new Solution();
		System.out.print(obj.subsets(nums));
	}

}
