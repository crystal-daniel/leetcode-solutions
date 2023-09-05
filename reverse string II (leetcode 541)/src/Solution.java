
public class Solution {
	public static String reverseStr(String s, int k) {
        char [] c = s.toCharArray();
        int start, end;
        char temp;
        for(int i = 0;i<s.length();i=i+2*k)
        {
            start = i;
            end = Math.min(i+k-1, s.length()-1);
            while(start<end)
            {
                temp = c[start];
                c[start++] = c[end];
                c[end--] = temp;
            }
        }
        return String.valueOf(c);
    }
	public static void main(String args[])
	{
		String s = "abcdefg";
		int k = 2;
		System.out.println("Before: "+s);
		s = reverseStr(s,k);
		System.out.println("After: "+s);
	}
}
