import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static String solve(String s) {
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i); // i 번째 문자
			
			// 여는 괄호들은 스택에 push
			if (c == '(' || c == '[') {
				stack.push(c);
			}
			
			// ')' 일 경우
			else if (c == ')') {
				// 스택이 비어있거나 pop할 원소가 소괄호가 아닌 경우
				if (stack.empty() || stack.peek() != '(') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			
			// ']' 일 경우
			else if (c == ']') {
				// 스택이 비어있거나 pop할 원소가 대괄호가 아닌 경우
				if (stack.empty() || stack.peek() != '[') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			
		}
		
		if (stack.empty()) {
			return "yes";
		}
		else {
			return "no";
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		String s;
		
		while (true) {
			
			s = br.readLine();
			
			// '.' 이면 종료
			if (s.equals(".")) {
				break;
			}
			
			sb.append(solve(s)).append('\n');
		}
		
		System.out.println(sb);
		
	}

}
