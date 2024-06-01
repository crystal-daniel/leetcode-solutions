import java.util.*;

public class Solution {
	public static List<String> printVertically(String s) {
        List<String> result= new ArrayList<>();
        String [] words = s.split(" ");
        int maxWordLength = max(words);
        for(int i=0; i<maxWordLength;i++)
        {
            StringBuilder str = new StringBuilder();
            for(String word: words)
            {
                if(i>=word.length())
                    str.append(" ");
                else
                    str.append(word.charAt(i));
            }
            result.add(trimRight(str.toString()));
        }
        return result;
    }
    static String trimRight(String s)
    {
        int i = s.length();
        while(--i>-1)
        {
            if(s.charAt(i)!=' ')
                return s.substring(0,i+1);
        }
        return null;
    }
    static int max(String [] words)
    {
        int max = 0;
        for(String word: words)
        {
            max = Math.max(max, word.length());
        }
        return max;
    }
	public static void main(String[] args) {
		String s = "TO BE OR NOT TO BE";
		System.out.println(printVertically(s));
	}
}
