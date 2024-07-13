import java.util.*;
public class Solution {
	public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        for(char ch: t.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)-1);
            }
        }
        for(char ch: map.keySet())
        {
            if(map.get(ch)!=0)
            {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nagaram"));
	}
}
