public class Solution {
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "", s2 = "";
        for(String s: word1)
        {
            s1 += s;
        }
        for(String s: word2)
        {
            s2 += s;
        }
        if(s1.equals(s2))
        {
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
		String [] word1 = {"ab", "c"}, word2 = {"a", "bc"};
		System.out.println(arrayStringsAreEqual(word1, word2));
	}
}
