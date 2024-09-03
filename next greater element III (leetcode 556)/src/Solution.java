public class Solution {
	public static int nextGreaterElement(int m) {
        long n = m;
        int [] count = new int[10];
        int currNum;
        int prevNum = 0;
        while(n>0)
        {
            currNum = (int)n%10;
            n /= 10;
            count[currNum]++;
            if(currNum < prevNum)
            {
                int num = currNum+1;
                while(count[num]==0)
                {
                    num++;
                }
                count[num]--;
                n = n*10 + num;
                for(int i=0;i<10;i++)
                {
                    while(count[i]-- > 0)
                    {
                        n = n*10 + i;
                    }
                }
                if(n > Integer.MAX_VALUE)
                {
                    return -1;
                }
                return (int)n;
            }
            prevNum = currNum;
        }
        return -1;
    }
	public static void main(String[] args) {
		System.out.println(nextGreaterElement(12));
	}
}