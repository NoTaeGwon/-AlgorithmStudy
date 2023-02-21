import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		
		// 원본 문자열을 담는 stack
		Stack<Character> stackL = new Stack<>();
		// 추가 문자열을 담는 stack
		Stack<Character> stackR = new Stack<>();
		
		// stackL에 문자열 삽입
		for (int i = 0; i < str.length(); i++) {
			stackL.push(str.charAt(i));
		}
		
		int N = Integer.parseInt(br.readLine());
		
		/* 
		 *  L: 커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
		 *  D: 커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
		 *  B: 커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
			  삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
			P $: $라는 문자를 커서 왼족에 추가
		 */
		
		for (int i = 0; i < N; i++) {
			String answer = br.readLine();
	
			// "L"을 입력 받을 경우
			if (answer.equals("L")) {
				// stackL이 비어 있지 않다면
				if (!stackL.isEmpty()) {
					stackR.push(stackL.pop()); // stackL의 가장 위 원소를 꺼내 stackR에 저장
				}
			}
			
			// "D"를 입력 방을 경우
			else if (answer.equals("D")) {
				// stackR이 비어 있지 않으면
				if (!stackR.empty()) {
					stackL.push(stackR.pop()); // stackR의 가장 위 원소를 꺼내 stackL에 저장
				}
			} 
			
			// "B"를 입력 받을 경우
			else if (answer.equals("B")) {
				// stackL이 비어 있지 않다면
				if (!stackL.empty()) {
					stackL.pop();	// stackL의 가장 위 원소를 삭제
				}
			
			// "P"를 입력 받을 경우 (contains("") -> 괄호안 문자가 포함 되어 있는지 확인) 
			} else if (answer.contains("P")) {
				char c = answer.charAt(2); // P 뒤의 문자를 입력 받고
				stackL.push(c);	// stackL에 push
			}

        }
		
		// 반복문이 종료되면 stackL이 빌 때 까지 원소들을 stackR에 push
		while(!stackL.empty()) {
			stackR.push(stackL.pop());
		}
		
		while(!stackR.empty()) {
			bw.write(stackR.pop());
		}

		bw.flush();
		bw.close();
	}

}
