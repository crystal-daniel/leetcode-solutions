import java.util.*;
public class Solution {
	public static int[] shortestToChar(String s, char c) {
        List<Integer> list = new ArrayList<>();
        int [] res = new int[s.length()];
        list.add(-1000);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                list.add(i);
            }
        }
        list.add(Integer.MAX_VALUE);
        int first = list.get(0);
        int second = list.get(1);
        int k = 2;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=c)
            {
                res[i] = Math.min(i - first, second - i);
            }
            else
            {
                first = second;
                second = list.get(k++);
            }
        } 
        return res;       
    }
	public static void main(String[] args) {
		String s = "loveleetcode";
		char c = 'e';
		System.out.println(Arrays.toString(shortestToChar(s, c)));
	}
}