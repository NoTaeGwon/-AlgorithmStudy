import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		Stack<Integer> stk = new Stack<Integer>();
		
		int K = stdIn.nextInt();		// 정수를 몇개 받을지 정해주는 변수
		int sum = 0; 					// 스택에 있는 원소들의 합
		
		for (int i = 0; i < K; i++) {
			int num = stdIn.nextInt(); 	// 정수를 입력 받는 변수
			
			if (num == 0) { 			// 0을 입력하면 top에 있는 원소를 지움
				stk.pop();
			} else {
				stk.push(num);
			}
		}
		
		for (int s : stk) {
			sum += s;
		}
		
		System.out.println(sum);

	}

}
