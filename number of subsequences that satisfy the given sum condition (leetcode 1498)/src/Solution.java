import java.util.*;
public class Solution {
	List<List<Integer>> answer = new ArrayList<>();
    int minElement(List<Integer> list)
    {
        int min = list.get(0);
        for(int n: list)
        {
            if(n<min)
            {
                min = n;
            }
        }
        return min;
    }
    int maxElement(List<Integer> list)
    {
        int max = list.get(0);
        for(int n: list)
        {
            if(n>max)
            {
                max = n;
            }
        }
        return max;
    }
    void calculateSubseq(int index, int [] nums, int target, List<Integer> res)
    {
        if(index>=nums.length)
        {
            if(res.size()!=0 && minElement(res)+maxElement(res)<=target)
            {
                answer.add(new ArrayList<>(res));
            }
            return;
        }
        res.add(nums[index]);
        calculateSubseq(index+1, nums, target, res);
        res.remove(res.size()-1);
        calculateSubseq(index+1, nums, target, res);
    }
    public int numSubseq(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        calculateSubseq(0, nums, target, res);
        return answer.size();
    }
    
    //Approach 2 - Two Pointers
    public int numSubseq2(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0, r = nums.length-1, mod = (int)1e9 + 7, res = 0;
        int [] pows = new int[nums.length];
        pows[0] = 1;
        for(int i=1;i<nums.length;i++)
        {
            pows[i] = (pows[i-1] * 2) % mod;
        }
        while(l<=r)
        {
            if(nums[l]+nums[r]<=target)
            {
                res = (res + pows[r-l]) % mod;
                l++;
            }
            else
            {
                r--;
            }
        }
        return res;
    }
	public static void main(String[] args) {
		int nums[] = {14,4,6,6,20,8,5,6,8,12,6,10,14,9,17};
		int target = 22;
		Solution obj = new Solution();
		System.out.println("Approach 1: "+obj.numSubseq(nums,target));
		System.out.println("Approach 2: "+obj.numSubseq2(nums,target));
	}
}