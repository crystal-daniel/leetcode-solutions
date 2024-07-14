import java.util.*;
public class Solution {
	public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String s: strs)
        {
            String freqStr = frequencyString(s);
            if(res.containsKey(freqStr))
            {
                res.get(freqStr).add(s);
            }
            else
            {
                List<String> strings = new ArrayList<>();
                strings.add(s);
                res.put(freqStr, strings);
            }
        }
        return new ArrayList<>(res.values());
    }
    static String frequencyString(String s)
    {
        int count[] = new int[26];
        for(char c: s.toCharArray())
        {
            count[c - 'a'] += 1;
        }
        String frequencyStr = "";
        for(int i = 0;i < 26; i++)
        {
            if(count[i]!=0)
            {
                frequencyStr = frequencyStr + (char)(i + 'a') + count[i];
            }
        }
        return frequencyStr;
    }
	public static void main(String[] args) {
		String [] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));
	}
}
