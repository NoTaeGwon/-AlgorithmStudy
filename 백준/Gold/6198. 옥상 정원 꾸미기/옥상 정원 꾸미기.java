import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		Stack<Integer> stk = new Stack<Integer>();
		
		int N = stdIn.nextInt(); 		// 건물 개수
		long count = 0; 					// 볼수 있는 개수
		
		for (int i = 0; i < N; i++) {
			int h = stdIn.nextInt();	// 건물 높이
			
			// 해당 건물 높이보다 같거나 작으면 pop
			while (!stk.isEmpty() && stk.peek() <= h) { 
				stk.pop();
			}
			
			count += stk.size();
			stk.push(h);
		}
		
		System.out.println(count);
	}

}
