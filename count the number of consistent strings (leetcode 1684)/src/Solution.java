import java.util.*;
public class Solution {
	public static int countConsistentStrings(String allowed, String[] words) {
        List<Character> list = new ArrayList<>();
        int count = 0;
        for(int i=0;i<allowed.length();i++)
        {
            list.add(allowed.charAt(i));
        }
        for(String s: words)
        {
            for(int i=0;i<s.length();i++)
            {
                if(!list.contains(s.charAt(i)))
                {
                    count++;
                    break;
                }
            }
        }
        return words.length-count;
    }
	public static void main(String[] args) {
		String allowed = "cad", words[] = {"cc","acd","b","ba","bac","bad","ac","d"};
		System.out.print(countConsistentStrings(allowed, words));
	}
}