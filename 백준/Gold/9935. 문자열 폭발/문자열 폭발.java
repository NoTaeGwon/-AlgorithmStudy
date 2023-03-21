import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		
		String s = br.readLine();
		String boom = br.readLine();
		
		for (int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
			if (stack.size() >= boom.length()) {
				boolean contain = true;
				for (int j = 0; j < boom.length(); j++) {
					if (stack.get(stack.size() - boom.length() + j) != boom.charAt(j)) {
						contain = false;
						break;
					}
				}
				if (contain) {
					for (int j = 0; j < boom.length(); j++) {
						stack.pop();
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (Character c : stack) {
			sb.append(c);
		}
		
		System.out.println(sb.length() == 0 ? "FRULA" : sb.toString());
	}

}
