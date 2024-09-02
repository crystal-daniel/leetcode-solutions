import java.util.*;
public class Solution {
	List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(res, 0, 0, n, "");
        return res;
    }
    void generate(List<String> res, int open, int close, int n, String value)
    {
        if(value.length() == 2*n)
        {
            res.add(value);
            return;
        }
        if(open<n)
        {
            generate(res, open+1, close, n, value+"(");
        }
        if(close<open)
        {
            generate(res, open, close+1, n, value+")");
        }
    }
	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.print(obj.generateParenthesis(3));
	}
}