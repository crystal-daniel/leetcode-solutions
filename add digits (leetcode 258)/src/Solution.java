
public class Solution {
	public static int addDigits(int num) {
        if(num/10==0)
            return num;
        else
            return addDigits((num%10)+addDigits(num/10));
    }
	public static void main(String[] args) {
		int sum=addDigits(38);
		System.out.print(sum);
	}
}
