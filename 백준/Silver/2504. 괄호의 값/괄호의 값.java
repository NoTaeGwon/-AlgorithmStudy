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
		Stack<Character> stack = new Stack<>();
		
		String s = br.readLine();
		int result = 0;
		int value = 1;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(s.charAt(i));
				value *= 2;
			} else if (s.charAt(i) == '[') {
				stack.push(s.charAt(i));
				value *= 3;
			} else if (s.charAt(i) == ')') {
				if (stack.isEmpty() || stack.peek() != '(') {
					result = 0;
					break;
				} else if (s.charAt(i - 1) == '(') {
					result += value;
				}
				stack.pop();
				value /= 2;
			} else if (s.charAt(i) == ']') {
				if (stack.isEmpty() || stack.peek() != '[') {
					result = 0;
					break;
				} else if (s.charAt(i - 1) == '[') {
					result += value;
				}
				stack.pop();
				value /= 3;
			}
		}
		
		if (!stack.isEmpty()) {
			bw.write(0 + "");
		} else {
			bw.write(result + "");
		}
		
		bw.flush();
		bw.close();
	}

}
