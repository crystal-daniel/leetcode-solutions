import java.util.*;

public class Solution {
	public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        int i=0;
        for(String word: words)
        {
            if(word.contains(Character.toString(x)))
            {
                result.add(i);
            }
            i++;
        }
        return result;
    }
	public static void main(String[] args) {
		String [] words = {"abc","bcd","aaaa","cbc"};
		char x = 'a';
		System.out.print(findWordsContaining(words, x));
	}
}
