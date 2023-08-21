public class Solution {
	public static int smallestEvenMultiple(int n) {
        if(n%2==0)
            return n;
        return 2*n;
    }
	public static void main(String[] args) {
		System.out.print(smallestEvenMultiple(12));
	}
}
