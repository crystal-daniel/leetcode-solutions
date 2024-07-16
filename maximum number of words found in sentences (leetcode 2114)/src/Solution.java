public class Solution {
	public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s: sentences)
        {
            int temp = (s.length() - s.replace(" ","").length()) + 1;
            if(temp > max)
            {
                max = temp;
            }
        }
        return max;
    }
	public static void main(String[] args) {
		String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		System.out.println(mostWordsFound(sentences));
	}
}
