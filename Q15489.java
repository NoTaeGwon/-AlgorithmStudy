import java.util.Scanner;

public class Q15489 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int [][] dp = new int[31][31];
		
		int r = stdIn.nextInt();
		int c = stdIn.nextInt();
		int w = stdIn.nextInt();
		int sum = 0;
		
		dp[1][1] = 1;
		
		for (int i = 1; i <= 30; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == i || j == 1) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
				}
			}
		}
		
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < i + 1; j++) {
				sum += dp[r + i][c + j];
			}
		}
		
		System.out.println(sum);

	}

}
