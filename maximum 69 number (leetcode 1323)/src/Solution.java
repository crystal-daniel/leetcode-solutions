
public class Solution {
	public static int maximum69Number(int num) {
        String n = Integer.toString(num);
        String res = "";
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)=='6')
            {
                res = res + '9' + n.substring(i+1,n.length());
                break;
            }
            else 
            {
                res = res + n.charAt(i);
            }
        }
        return Integer.valueOf(res);
    }
	public static void main(String[] args) {
		System.out.print(maximum69Number(6969));
	}
}
