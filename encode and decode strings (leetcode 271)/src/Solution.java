import java.util.*;
public class Solution {
	public static String encode(List<String> strs) {
        String str = "";
        for(String s: strs)
        {
            str = str + s +";:,:";
        }
        return str;
    }

    public static List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int start = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==';' && str.charAt(i+1)==':' && str.charAt(i+2)==',' && str.charAt(i+3)==':')
            {
                String s = str.substring(start, i);
                start = i+4;
                strs.add(s);
                i = i+4;
            }
        }
        return strs;
    }
	public static void main(String[] args) {
		List<String> strs = new ArrayList<>();
		strs.add("we");
		strs.add("say");
		strs.add(":");
		strs.add("yes");
		String encodedString = encode(strs);
		System.out.println("Encoded String: "+encodedString);
		System.out.println("Decoded String: "+decode(encodedString));
	}
}