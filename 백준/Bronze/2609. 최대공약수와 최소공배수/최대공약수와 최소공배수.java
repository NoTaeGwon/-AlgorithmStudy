import java.util.Scanner;
 
public class Main {
    // 최대공배수 (유클리드 호제법)
	static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			//GCD(x, y) = GCD(y, r)이므로 (r = x % y)
			return gcd(y, x % y);
		}
	}
	
	public static void main(String[] args) {
 
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
 
		int z = gcd(x, y);	// 최대공약수
 
		System.out.println(z);
		System.out.println(x * y / z);
 
	}
	
}

