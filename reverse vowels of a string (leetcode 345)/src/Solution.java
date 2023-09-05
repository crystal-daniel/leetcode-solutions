
public class Solution {
	static boolean isVowel(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' || c=='I' ||c=='O' || c=='U')
        {
            return true;
        }
        return false;
    }
    public static String reverseVowels(String s) {
        char [] c = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<end)
        {
            if(!isVowel(c[start]))
            {
                start++;
            }
            else if(!isVowel(c[end]))
            {
                end--;
            }
            else
            {
                char temp = c[start];
                c[start++] = c[end];
                c[end--] = temp;
            }
        }
        return String.valueOf(c);
    }
	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println("Before: "+s);
		s = reverseVowels(s);
		System.out.println("After: "+s);
	}
}
