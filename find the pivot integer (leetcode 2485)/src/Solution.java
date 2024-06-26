
public class Solution {
	public static int pivotInteger(int n) {
        int totalSum = n*(n+1)/2;
        int sum = 0, prevSum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = sum + i;
            if((totalSum-sum)==prevSum)
            {
                return i;
            }
            prevSum = sum;
        }
        return -1;
    }
	public static void main(String[] args) {
		System.out.println(pivotInteger(8));
	}
}
