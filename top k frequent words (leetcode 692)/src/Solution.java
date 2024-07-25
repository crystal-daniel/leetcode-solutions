import java.util.*;
public class Solution {
	public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: words)
        {
            if(map.containsKey(s))
            {
                map.put(s, map.get(s)+1);
            }
            else
            {
                map.put(s, 0);
            }
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> {
            if(map.get(a)==map.get(b))
            {
                return a.compareTo(b);
            }
            else
            {
                return map.get(b) - map.get(a);
            }
        });
        for(int i=list.size()-1;i>=k;i--)
        {
            list.remove(i);
        }
        return list;
    }
	public static void main(String[] args) {
		String [] words = {"i","love","leetcode","i","love","coding"};
		int k = 2;
		System.out.print(topKFrequent(words, k));
	}
}