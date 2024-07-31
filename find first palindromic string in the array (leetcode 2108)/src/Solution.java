public class Solution {
	public static String firstPalindrome(String[] words) {
        for(String s: words)
        {
            boolean palindrome = true;
            int l = 0;
            int h = s.length() - 1;
            while(l<h)
            {
                if(s.charAt(l++) != s.charAt(h--))
                {
                    palindrome = false;
                    break;
                }
            }
            if(palindrome)
            {
                return s;
            }
        }
        return "";
    }
	public static void main(String[] args) {
		String [] words = {"abc","car","ada","racecar","cool"};	
		System.out.print(firstPalindrome(words));
	}
}