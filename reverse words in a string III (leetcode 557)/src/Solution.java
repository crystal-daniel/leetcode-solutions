public class Solution {
	public static String reverseWords(String s) {
        char [] c = s.toCharArray();
        int start = 0, end = 0;
        for(int i = 0;i<s.length();i++)
        {
            if(c[i]==' ')
            {
                end = i-1;
                while(start<end)
                {
                    char temp = c[start];
                    c[start++] = c[end];
                    c[end--] = temp;
                }
                start = i+1;
            }
        }
        end = s.length()-1;
        while(start<end)
        {
            char temp = c[start];
            c[start++] = c[end];
            c[end--] = temp;
        }
        return String.valueOf(c);
    }
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println("Before: "+s);
		s = reverseWords(s);
		System.out.println("After: "+s);
	}
}
