
public class Solution {
	public static char findTheDifference(String s, String t) {
        int s1=0;
        int t1=0;
        for(int i=0;i<s.length();i++)
        {
            s1=s1+s.charAt(i);
        }
        for(int i=0;i<t.length();i++)
        {
            t1=t1+t.charAt(i);
        }
        int ch=t1-s1;
        char c=(char)ch;
        return c;
    }
	public static void main(String[] args) {
		String s="abcd";
		String t="abcde";
		System.out.print("The extra character is: "+findTheDifference(s,t));
	}
}
