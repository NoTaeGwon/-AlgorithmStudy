import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<int[]> stack = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= N; i++) {
			int top = Integer.parseInt(st.nextToken());
			while (!stack.isEmpty()) {
				if (stack.peek()[1] >= top) { // 만약 입력받은 높이가 현재 값 보다 높으면
					sb.append(stack.peek()[0] + " "); // 현재값(위치) 출력
					break;
				}
				stack.pop(); // 그렇지 않으면 레이저가 닿을 수 없으니 pop
			}
			if (stack.isEmpty()) { // 만약 스택이 비어 있으면
				sb.append("0 "); // 0 출력
			} 
			stack.push(new int[] {i, top});
		}
		System.out.println(sb);
		
	}

}
