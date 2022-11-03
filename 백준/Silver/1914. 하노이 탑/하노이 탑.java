import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void hanoi(int num, int from, int by, int to) {
        if(num == 1) {
            sb.append(from + " " + to + "\n");
        } else {
            hanoi(num-1, from, to, by); // 1번에서 2번으로
            sb.append(from + " " + to + "\n");
            hanoi(num-1, by, from, to); // 2번에서 3번으로
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        BigInteger res = new BigInteger("1");
        
        int N = stdIn.nextInt();
        
        if (N<=20) { 
            hanoi(N, 1, 2, 3);
            sb.insert(0, (int)(Math.pow(2, N) - 1) + "\n");
            System.out.print(sb);
        } else { // 20 초과하면 BigInteger로 이동 횟수만 출력
            for(int i=0; i<N; ++i) {
                res = res.multiply(new BigInteger("2")); // 2의 N 제곱
            }
            res = res.subtract(new BigInteger("1")); // 빼기 1
            System.out.println(res);
        }
    }
}

//다른 풀이 (메모리 초과)
//import java.util.Scanner;
//
//public class Main {
//	static void move(int no, int x, int y) {
//		if (no > 1) {
//			move(no - 1, x, 6 - x - y);
//		}
//		
//		System.out.println(x + " " + y);
//
//		if (no > 1) {
//			move(no - 1, 6 - x - y, y);
//		}
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner stdIn = new Scanner(System.in);
//		int n = stdIn.nextInt();
//		
//		int r = (int)Math.pow(2, n);
//		System.out.println(r - 1);
//		move(n, 1, 3);
//
//	}
//
//}
//
