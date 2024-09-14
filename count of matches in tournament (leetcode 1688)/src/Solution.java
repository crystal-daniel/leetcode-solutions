public class Solution {
	public static int numberOfMatches(int n) {
        int totalMatches = 0;
        while(n>1)
        {
            if(n%2==0)
            {
                totalMatches = totalMatches + (n/2);
                n = n/2;
            }
            else
            {
                totalMatches = totalMatches + (n-1)/2;
                n = ((n-1)/2) + 1;
            }
        }
        return totalMatches;
    }
	public static void main(String[] args) {
		System.out.println(numberOfMatches(14));
	}
}