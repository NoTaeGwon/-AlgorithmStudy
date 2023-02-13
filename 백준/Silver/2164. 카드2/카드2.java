import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Queue<Integer> Q = new LinkedList<>(); 
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= N; i++) {	// 큐에 1 뷰터 N 까지 수 삽입
			Q.add(i);
		}
		
		while(Q.size() > 1) {
			Q.poll();					// 맨 앞의 원소 버림
			Q.add(Q.poll());			// 버린 원소를 맨 뒤에 삽입
		}

		System.out.println(Q.poll());
		
	}

}
