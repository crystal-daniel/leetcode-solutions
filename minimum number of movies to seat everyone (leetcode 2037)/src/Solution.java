import java.util.Arrays;

public class Solution {
	public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int res = 0;
        for(int i = 0; i < seats.length;i++)
        {
            res += (int)Math.abs(seats[i] - students[i]);
        }
        return res;
    }
	public static void main(String[] args) {
		int [] seats = {4,1,5,9}, students = {1,3,2,6};
		System.out.println(minMovesToSeat(seats, students));
	}
}