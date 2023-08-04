
public class Solution {
	public static boolean judgeSquareSum(int c) {
        long end=(long)(Math.sqrt(c));
        int start = 0;
        while(start<=end)
        {
            if((start*start)+(end*end)==c)
                return true;
            else if((start*start)+(end*end)>c)
                end--;
            else
                start++;
        }
        return false;
    }
	public static void main(String[] args) {
		System.out.print(judgeSquareSum(2147483600));

	}
}
