import java.util.*;
public class Solution {
	public static int[] sortJumbled(int[] mapping, int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int temp = nums[i], sum = 0, pow = 0;
            if(temp == 0)
            {
                sum = mapping[0];
            }
            while(temp!=0)
            {
                int a = mapping[temp%10];
                sum = sum + a * (int)Math.pow(10,pow++);
                temp /= 10;
            }
            res[i] = sum;
            map.put(nums[i], sum);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        
        Collections.sort(list, (a,b) ->{
        	return map.get(a) - map.get(b);
        });
        for(int i=0;i<res.length;i++)
        {
        	res[i] = list.get(i);
        }
        return res;
    }
	public static void main(String[] args) {
		int [] mapping = {8,9,4,0,2,1,3,5,7,6}, nums = {991,338,38};
		System.out.println(Arrays.toString(sortJumbled(mapping, nums)));
	}
}