import java.util.*;
public class Solution {
	public static int longestConsecutive(int[] nums) {
        int longestLength = 0;
        Map<Integer, Boolean> map = new HashMap<>();
        for(int n: nums)
        {
            map.put(n, false);
        }
        for(int n: nums)
        {
            int currentLength = 1;
            int nextNum = n + 1;
            while(map.containsKey(nextNum) && map.get(nextNum) == false)
            {
                currentLength++;
                map.put(nextNum, true);
                nextNum++;
            }
            int prevNum = n - 1;
            while(map.containsKey(prevNum) && map.get(prevNum) == false)
            {
                currentLength++;
                map.put(prevNum, true);
                prevNum--;
            }
            map.put(n, true);
            longestLength = Math.max(longestLength, currentLength);
        }
        return longestLength;
    }
	public static void main(String[] args) {
		int [] nums = {100,4,200,1,3,2};
		System.out.print(longestConsecutive(nums));
	}
}