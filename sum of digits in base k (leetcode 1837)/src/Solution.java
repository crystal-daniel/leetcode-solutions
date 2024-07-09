public class Solution {
	public static int sumBase(int n, int k) {
        int sum = 0;
        while(n!=0)
        {
            int a = n % k;
            sum = sum + a;
            n /= k;
        }
        return sum;
    }
	public static void main(String[] args) {
		System.out.println(sumBase(34, 6));
	}
}