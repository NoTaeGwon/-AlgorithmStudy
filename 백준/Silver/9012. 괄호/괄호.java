import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static String solve(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c == '(') {
				stack.push(c);	// '(' 가 입력되면 push
			} else if (stack.empty()) {	
				return "NO";	// ')'가 입력되었으나 pop할 원소가 없거나, 스택이 비어있는 경우
			} else {
				stack.pop(); 	// 위의 경우가 아니라면 원소를 pop
			}
		}
		
		// 모든 입력이 끝나고
		
		if (stack.empty()) {	
			return "YES";	// 스택에 요소가 남아 잇으면 "NO"
		} else {
			return "NO";	// 스택이 비어 있으면 "YES"
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int T = stdIn.nextInt();	// 입력 받을 데이터의 계수
		
		for (int i = 0; i < T; i++) {
			System.out.println(solve(stdIn.next())); // 입력받은 괄호를 solve 메소드로 전달하고 출력한다.
		}
		
	}

}
