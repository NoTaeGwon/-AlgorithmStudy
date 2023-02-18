import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// 최대 힙을 구현 할려면 "Collections.reverseOrder()"를 선언해야한다.
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
        
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			// 0을 입력하면 가장 큰 값을 출력
			if (num == 0) {
				if (!q.isEmpty()) {
					sb.append(q.poll()).append('\n');
				}
                
				// 만약 힙이 비어었으면 0을 삽입
				else {
					sb.append(0).append('\n');
				}
			}
            
			q.add(num);
		}
		
		System.out.println(sb);
	}

}
