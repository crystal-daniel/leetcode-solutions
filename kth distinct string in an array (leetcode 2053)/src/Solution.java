import java.util.*;
public class Solution {
	public static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String s: arr)
        {
            if(map.containsKey(s))
            {
                map.put(s, map.get(s)+1);
            }
            else
            {
                map.put(s, 1);
            }
        }
        String distinct = "";
        for(String s: arr)
        {
            if(map.get(s) == 1)
            {
                k--;
                if(k==0)
                {
                    distinct = s;
                    break;
                }
            }
        }
        return distinct;
    }
	public static void main(String[] args) {
		String [] arr = {"d","b","c","b","c","a"};
		System.out.println(kthDistinct(arr, 2));
	}
}