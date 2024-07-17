import java.util.*;
public class Solution {
	public static int[] topKFrequent(int[] nums, int k) {
        List<Integer> bucket[] = new List[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums)
        {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        for(int key: map.keySet())
        {
            int frequency = map.get(key);
            if(bucket[frequency] == null)
            {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int counter = 0;
        int [] res = new int [k];
        for(int i=bucket.length-1; i>0 && counter<k; i--)
        {
            if(bucket[i] != null)
            {
                for(int n: bucket[i])
                {
                    res[counter++] = n;
                }
            }
        }
        return res;
    }
	public static void main(String[] args) {
		int nums[] = {1,1,1,2,2,3}, k = 2;
		System.out.println(Arrays.toString(topKFrequent(nums, k)));
	}
}
