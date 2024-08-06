public class Solution {
	public static int minimumPushes(String word) {
        int n = word.length();
        int sum = 0;
        if(n<=8)
        {
            sum = n;
        }
        else if(n>8 && n<17)
        {
            sum = 8 + (n-8)*2;
        }
        else if(n>16 && n<25)
        {
            sum = 24 + (n-16)*3;
        }
        else
        {
            sum = 48 + (n-24)*4;
        }
        return sum;
    }
	public static void main(String[] args) {
		System.out.print(minimumPushes("xycdefghij"));
	}
}