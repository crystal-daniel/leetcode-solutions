import java.util.*;
public class Solution {
	List<List<Integer>> answer = new ArrayList<>();
    void findCombinations(int[] candidates, int target, int index, List<Integer> res)
    {
        if(index>=candidates.length)
        {
            if(target==0)
            {
                answer.add(new ArrayList<>(res));
            }
            return;
        }
        if(candidates[index]<=target)
        {
            res.add(candidates[index]);
            findCombinations(candidates, target-candidates[index], index, res);
            res.remove(res.size()-1);
        }
        findCombinations(candidates, target, index+1, res);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> res = new ArrayList<>();
        findCombinations(candidates, target, 0, res);
        return answer;
    }
	public static void main(String[] args) {
		int candidates[] = {2,3,6,7}, target = 7;
		Solution obj = new Solution();
		System.out.print(obj.combinationSum(candidates, target));
	}
}