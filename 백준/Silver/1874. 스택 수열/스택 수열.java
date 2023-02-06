import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		
		int N = Integer.parseInt(br.readLine());
		int start = 0;
		
		for (int i = N; i > 0; i--) {
			int value = Integer.parseInt(br.readLine());
			
			if (value > start) {
				// start + 1 부터 입력받은 value 까지 push
				for (int j = start + 1; j <= value; j++) { 
					stack.push(j);
					sb.append('+').append('\n'); // StringBuilder에 '+' 저장
				}
				start = value; // 다음 push 위한 변수 초기화 (오름차순 유지)
				
			// top에 있는 원소가 입력받은 값과 같지 않을 경우
			} else if (stack.peek() != value) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append('-').append('\n'); // // StringBuilder에 '-' 저장
		}
		
		System.out.println(sb);
	}

}
