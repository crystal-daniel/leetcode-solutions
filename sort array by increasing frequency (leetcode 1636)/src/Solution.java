import java.util.*;
public class Solution {
	public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums)
        {
            if(map.containsKey(n))
            {
                map.put(n, map.get(n)+1);
            }
            else
            {
                map.put(n, 1);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> {
            if(map.get(a) == map.get(b))
            {
                return b - a;
            }
            else
            {
                return map.get(a) - map.get(b);
            }
        });
        int [] res = new int[nums.length];
        int i = 0;
        for(int n: list)
        {
            for(int j=0;j<map.get(n);j++)
            {
                res[i++] = n;
            }
        }
        return res;
    }
	public static void main(String[] args) {
		int [] nums = {1,1,2,2,2,3};
		System.out.print(Arrays.toString(frequencySort(nums)));
	}
}