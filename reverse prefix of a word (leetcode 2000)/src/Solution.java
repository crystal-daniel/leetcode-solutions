public class Solution {
	public static String reversePrefix(String word, char ch) {
        int h = word.indexOf(ch);
        StringBuilder s = new StringBuilder(word);
        int l = 0;
        while(l<=h)
        {
            s.setCharAt(l, word.charAt(h));
            s.setCharAt(h, word.charAt(l));
            l++;
            h--;
        }
        return s.toString();
    }
	public static void main(String[] args) {
		System.out.println(reversePrefix("abcdefd", 'd'));
	}
}