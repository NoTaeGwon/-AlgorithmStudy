package practice;

import java.util.Scanner;

public class BackPack {
	// ��ǰ�� �� (1 <= n <= 100), ��ƿ �� �ִ� ���� (1 <= k <= 100,000)
	static int n, k; 
	// �� ������ ���� (1 <= w <= 100,000), �ش��ϴ� ������ ��ġ (0 <= v <= 1,000)
	static int dp[][], w[], v[]; 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		
		dp = new int [n + 1][k + 1];
		
		w = new int [n + 1];
		v = new int [n + 1];
		
		for (int i = 1; i <= n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				dp[i][j] = dp[i - 1][j];
				if (j - w[i] >= 0) {
					dp[i][j] = Math.max(v[i] + dp[i - 1][j - w[i]], dp[i - 1][j]);
				}
				
			}
		}
		
		System.out.println(dp[n][k]);
		
		

	}

}
