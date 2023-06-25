
public class Solution {
	static String sum="";
    public static char Adder(char a, char b, char c)
    {
       if(a=='0' && b=='0' && c=='0')
        {
            sum="0"+sum;
            return '0';
        }
        if(a=='0' && b=='0' && c=='1')
        {
            sum="1"+sum;
            return '0';
        }
        if(a=='0' && b=='1' && c=='0')
        {
            sum="1"+sum;
            return '0';
        }
        if(a=='0' && b=='1' && c=='1')
        {
            sum="0"+sum;
            return '1';
        }
        if(a=='1' && b=='0' && c=='0')
        {
            sum="1"+sum;
            return '0';
        }
        if(a=='1' && b=='0' && c=='1')
        {
            sum="0"+sum;
            return '1';
        }
        if(a=='1' && b=='1' && c=='0')
        {
            sum="0"+sum;
            return '1';
        }
        else
        {
            sum="1"+sum;
            return '1';
        }
    }
    public static String addBinary(String a, String b) {
        int i=a.length()-1;
        char cin='0';
        int n=b.length()-1;
        while(i>=0 && n>=0)
        {
            cin=Adder(a.charAt(i),b.charAt(n),cin);
            i--;
            n--;
        }
        if(a.length()>b.length())
        {
            for(int j=i;j>=0;j--)
            {
                cin=Adder(a.charAt(j),'0',cin);
            }
        }
        else if(b.length()>a.length())
        {
            for(int j=n;j>=0;j--)
            {
                cin=Adder('0',b.charAt(j),cin);
            }
        }
        
        if(cin=='1')
        	sum=cin+sum;
        String temp=sum;
        sum="";
        return temp;
    }
	public static void main(String[] args) {
		String ans = addBinary("11","1");
		System.out.println(ans);
	}
}
