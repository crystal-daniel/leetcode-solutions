import java.util.*;
public class Solution {
	public static int minimumPushes(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: word.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else
            {
                map.put(c, 1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue()); // Descending order
            }
        });
        int k = 0;
        int sum = 0;
        for(Map.Entry<Character, Integer> entry : list)
        {
            int val = (int)Math.floor(k/8) + 1;
            k++;
            sum += entry.getValue() * val;
        }
        return sum;
    }
	public static void main(String[] args) {
		System.out.print(minimumPushes("alporfmdqsbhncwyu"));
	}
}
