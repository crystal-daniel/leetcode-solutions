
public class Solution {
	public static int numberOfSteps(int num) {
        char steps = 0;
        while(num!=0)
        {
            if(num%2==0)
            {
                num = num/2;
            }
            else
            {
                num--;
            }
            steps++;
        }
        return steps;
    }
	public static void main(String[] args) {
		System.out.print(numberOfSteps(14));
	}
}
