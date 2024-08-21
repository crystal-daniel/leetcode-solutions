public class Solution {
	public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0, temp = x;
        while(x!=0)
        {
            char a = (char) (x % 10);
            sum += a;
            x /= 10;
        }
        if(temp%sum==0)
        {
            return sum;
        }
        return -1;
    }
	public static void main(String[] args) {
		System.out.println(sumOfTheDigitsOfHarshadNumber(18));
	}
}