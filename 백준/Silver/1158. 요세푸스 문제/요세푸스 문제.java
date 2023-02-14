import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> Q = new LinkedList<>();
		
		for (int i = 1; i <= N; i++) { // 큐에 1 ~ N 까지 수 add
			Q.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while (Q.size() != 1) { // 큐의 용량이 1이 될 때까지 반복
			for (int i = 0; i < K - 1; i++) { // K - 1 번째 까지 맨 앞에 있는 값을 맨 뒤로 보낸다.
				Q.add(Q.poll()); // poll -> 큐 맨 앞에 있는 값 반환 후 삭제
			}
			sb.append(Q.poll() + ", "); // K 번째 있는 값 sb에 저장
		}
		
		sb.append(Q.poll() + ">"); // 큐에 하나 남은 요소 sb에 저장
		
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();

	}

}
