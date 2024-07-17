public class Solution {
	public static String truncateSentence(String s, int k) {
        int whiteSpace = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                whiteSpace++;
            }
            if(whiteSpace == k)
            {
                s = s.substring(0,i);
            }
        }
        return s;
    }
	public static void main(String[] args) {
		System.out.println(truncateSentence("What is the solution to this problem", 4));
	}
}
