import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		
		int result = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') { // 열린 괄호면 스택에 추가
				stack.push('(');
			}
			
			if (str.charAt(i) == ')') {	// 닫힌 괄호일 경우
				stack.pop();	// 스택에서 빼고
				
				if (str.charAt(i - 1) == '(') { // 그 전 괄호가 '('이면 레이저 이므로
					result += stack.size(); // 현제 스택에 있는 '(' (사이즈) 만큼 더함
				} else result ++; // 그 전 괄호가 '('이 아니면 레이저가 아니므로 1을 더함
			}
		}
		
		bw.write(result + "");
		bw.flush();
		bw.close();
	}

}
