
public class Solution {
	public static int countDigits(int num) {
        int temp = num;
        char count = 0;
        while(temp!=0)
        {
            char a = (char)(temp%10);
            if(num%a==0)
            {
                count++;
            }
            temp/=10;
        }
        return (int)count;
    }
	public static void main(String[] args) {
		System.out.print(countDigits(1248));
	}
}
