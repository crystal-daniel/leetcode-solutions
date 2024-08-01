public class Solution {
	public static int countSeniors(String[] details) {
        int count = 0;
        for(int i=0;i<details.length;i++)
        {
            int age = Integer.valueOf(details[i].substring(11,13));
            if(age>60)
            {
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		String [] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
		System.out.println(countSeniors(details));
	}
}