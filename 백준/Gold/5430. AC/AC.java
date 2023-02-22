import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void AC(String command, ArrayDeque<Integer> deque) {
		/*
		 * R: 배열에 있는 수의 순서를 뒤집는 함수
		 * D: 첫 번째 수를 버리는 함수 (배열이 비어있는데 D를 사용한 경우 error 발생)
		 */
		boolean isRight = true; // 앞뒤 방향을 알려주는 변수

		for (char cmd : command.toCharArray()) {
			
			// R 함수
			if (cmd == 'R') {
				isRight = !isRight;	// 방향을 바꿔줌
				continue;
			}
			
			// D 함수
			if (isRight) {
				// 만약 반환 된 원소가 없을 경우 error를 출력하도록 하고 함수 종료
				if (deque.pollFirst() == null) {
					sb.append("error\n");
					return;
				}
			}

			else {
				// 만약 반환 된 원소가 없을 경우 error를 출력하도록 하고 함수 종료
				if (deque.pollLast() == null) {
					sb.append("error\n");
					return;
				}
			}
		}
		
		makePrint(deque, isRight);
	}

	public static void makePrint(ArrayDeque<Integer> deque, boolean isRight) {
		sb.append('[');
		
		if (deque.size() > 0) { //만약 출력 할 원소가 한 개 이상일 경우
			
			if (isRight) {	// 정방향일경우 
				sb.append(deque.pollFirst()); // 먼저 첫 번째 원소를 저장하고
				
				// 그 다음 원소부터 반점과 덱의 원소를 하나씩 저장한다.
				while (!deque.isEmpty()) {
					sb.append(',').append(deque.pollFirst());

				}
			}

			else { // 역방향일 경우
				sb.append(deque.pollLast()); // 먼저 뒤에서 첫 번째 원소를 저장하고
				
				// 그 다음 원소부터 반점과 덱의 원소를 하나씩 저장한다.
				while (!deque.isEmpty()) {
					sb.append(',').append(deque.pollLast());
				}
			}
		}
		
		sb.append(']').append('\n');
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<Integer> deque;
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			String command = br.readLine(); // 명령어
			int N = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine(), "[],");
			deque = new ArrayDeque<Integer>();
			
			// deque에 원소 삽입
			for (int i = 0; i < N; i++) {
				deque.add(Integer.parseInt(st.nextToken()));
			}
			
			AC(command, deque);
		}
		
		System.out.println(sb);

	}

}
