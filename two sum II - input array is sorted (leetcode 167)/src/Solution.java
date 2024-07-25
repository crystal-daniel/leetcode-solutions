import java.util.Arrays;

public class Solution {
	public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int h = numbers.length - 1;
        while(l<=h)
        {
            int sum = numbers[l] + numbers[h];
            if(sum == target)
            {
                return new int[]{l+1, h+1};
            }
            else if(sum<target)
            {
                l++;
            }
            else
            {
                h--;
            }
        }
        return new int[]{l+1, h+1};
    }
	public static void main(String[] args) {
		int numbers[] = {2,7,11,15}, target = 9;
		System.out.print(Arrays.toString(twoSum(numbers, target)));
	}
}