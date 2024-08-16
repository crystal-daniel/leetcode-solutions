import java.util.Arrays;
public class Solution {
	public static int[] countBits(int n) {
        int [] res = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            res[i] = countingBits(i);
        }
        return res;
    }
    static int countingBits(int n) {
        int count = 0;
        while(n!=0)
        {
            if(n%2==1)
            {
                count++;
            }
            n /= 2;
        }
        return count;
    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(5)));
	}
}