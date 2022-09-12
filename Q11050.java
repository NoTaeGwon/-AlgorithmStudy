import java.util.Scanner;
// 자연수 n과 k가 주어졌을 때 이항 계수 (n/k)를 구하는 프로그램을 작성하라.
public class Q11050 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int k;
		int mul = 1;
		int mul1 = 1;
		int min;
		int min1 = 1;
		int val;
		
		Scanner stdIn = new Scanner(System.in);
		do { 
			 n = stdIn.nextInt();
			 k = stdIn.nextInt();
		} while (k > n);
		
		min = n - k;
			
		for (int i = 1; i <= n; i++) {
			mul = mul * i;
		}
		
		for (int j = 1; j <= k; j++) {
			mul1 = mul1 * j;
		}
		
		for (int z = 1; z <= min; z++) {
			min1 = min1 * z;
		}
		
		val = mul / (mul1 * min1);
		
		System.out.println(val);
		
		
	}

}
