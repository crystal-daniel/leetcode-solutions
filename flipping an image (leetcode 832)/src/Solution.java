import java.util.Arrays;
public class Solution {
	public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            int l = 0;
            int h = image.length - 1;
            while(l<h)
            {
                image[i][l] = image[i][l] ^ image[i][h];
                image[i][h] = image[i][l] ^ image[i][h];
                image[i][l] = image[i][l] ^ image[i][h];
                l++;
                h--;
            }
            for(int j=0;j<image.length;j++)
            {
                image[i][j] = image[i][j] ^ 1;
            }
        }
        return image;
    }
	public static void main(String[] args) {
		int [][] image = {{1,1,0},{1,0,1},{0,0,0}};
		flipAndInvertImage(image);
		for(int [] n: image)
		{
			System.out.print(Arrays.toString(n));
		}
	}
}