import java.util.*;
public class Solution {
	List<List<Integer>> answer = new ArrayList<>();
    void findSubseq(int index, int [] candidates, int target, List<Integer> res)
    {
        if(target==0)
        {
            answer.add(new ArrayList<>(res));
            return;
        }
        for(int i=index;i<candidates.length;i++)
        {
            if(i>index && candidates[i]==candidates[i-1])
            {
                continue;
            }
            if(candidates[i]>target)
            {
                break;
            }
            res.add(candidates[i]);
            findSubseq(i+1, candidates, target-candidates[i], res);
            res.remove(res.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(candidates);
        findSubseq(0, candidates, target, res);
        return answer;
    }
	public static void main(String[] args) {
		Solution obj = new Solution();
		int candidates[] = {10,1,2,7,6,1,5}, target = 8;
		System.out.print(obj.combinationSum2(candidates, target));
	}
}