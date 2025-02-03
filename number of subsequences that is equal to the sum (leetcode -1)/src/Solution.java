import java.util.*;

public class Solution {
	List<List<Integer>> answer = new ArrayList<>();
	int res2 = 0;
	
	//using a data structure
    void calculateSubseq(int index, int [] nums, int target, int sum, List<Integer> res)
    {
        if(index>=nums.length)
        {
            if(sum==target)
            {
                answer.add(new ArrayList<>(res));
            }
            return;
        }
        res.add(nums[index]);
        calculateSubseq(index+1, nums, target, sum+nums[index], res);
        res.remove(res.size()-1);
        calculateSubseq(index+1, nums, target, sum-nums[index], res);
    }
    public int numSubseq(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        calculateSubseq(0, nums, target, 0, res);
        return answer.size();
    }
    
    //without using data structure
	void calculateSubseq2(int index, int [] nums, int target, int sum)
    {
        if(index>=nums.length)
        {
            if(sum==target)
            {
                res2++;
            }
            return;
        }
        calculateSubseq2(index+1, nums, target, sum+nums[index]);
        calculateSubseq2(index+1, nums, target, sum-nums[index]);
    }
    public int numSubseq2(int[] nums, int target) {
        calculateSubseq2(0, nums, target, 0);
        return res2;
    }
    int calculateSubseq3(int index, int [] nums, int target, int sum)
    {
        if(index>=nums.length)
        {
            if(sum==target)
            {
                return 1;
            }
            return 0;
        }
        int l = calculateSubseq3(index+1, nums, target, sum+nums[index]);
        int r = calculateSubseq3(index+1, nums, target, sum-nums[index]);
        return l+r;
    }
    public int numSubseq3(int[] nums, int target) {
        return calculateSubseq3(0, nums, target, 0);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 5;
        Solution obj = new Solution();
        System.out.println("Using Data Structure: "+obj.numSubseq(nums, target));
        System.out.println("Without using Data Structure: "+obj.numSubseq2(nums, target));
        System.out.println("Without using Data Structure 2: "+obj.numSubseq3(nums, target));
    }
}