import java.util.*;
public class Solution {
	public static String largestWordCount(String[] messages, String[] senders) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<senders.length;i++)
        {
            if(map.containsKey(senders[i]))
            {
                map.put(senders[i], map.get(senders[i]) + wordCount(messages[i]));
            }
            else
            {
                map.put(senders[i], wordCount(messages[i]));
            }
        }
        int max = 0;
        String sender = "";
        for(String s: map.keySet())
        {
            if (map.get(s) >= max) {
                sender = map.get(s) == max ? sender.compareTo(s) > 0 ? sender : s : s;
                max = map.get(s);
            }
        }
        return sender;
    }
    static int wordCount(String word)
    {
        int words = word.length() - word.replace(" ", "").length() + 1;
        return words;
    }
	public static void main(String[] args) {
		String [] messages = {"Hello userTwooo","Hi userThree","Wonderful day Alice","Nice day userThree"}, senders = {"Alice","userTwo","userThree","Alice"};
		System.out.print(largestWordCount(messages, senders));
	}
}