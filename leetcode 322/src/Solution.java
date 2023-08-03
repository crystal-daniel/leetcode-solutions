
public class Solution
{
	static int num=0;
	static int coinChange(int [] coins, int amount)
	{
		if(amount == 0)
            return num;
        else if(amount < 0)
            return -1;
        else
        {
        	for(int i =0;i<coins.length;i++)
			{
        		if(coins[i]==amount)
        		{
        			amount = amount - coins[i];
        			num++;
        			return num;
        		}
        		else if(coins[i]>amount)
        		{
        			amount = amount - coins[i-1];
        			num++;
        			break;
        		}
        	}
        	return coinChange(coins, amount);
//            int i = 0;
//            while(coins[i+1] <= amount && i < coins.length-2)
//            {
//                if(coins[i+1]==amount)
//                {
//                    amount = amount - coins[i+1];
//                    num++;
//                    return num;
//                }
//                else
//                {
//                	//System.out.println("You are inside the else block");
//                	i++;
//                } 
//            }
            //System.out.println(coins[i]);
            //System.out.println(amount);
            //amount = amount - coins[i];
            //System.out.println(amount);
            //num++;
            //return coinChange(coins, amount);
        }
	}
	public static void main(String args[])
	{
		int [] coins = {1, 3, 5};
		int [] coins1 = {1,2147483647};  
		System.out.print(coinChange(coins, 11));
		//System.out.print(coinChange(coins1, 2));
	}
}
