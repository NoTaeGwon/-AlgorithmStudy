import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		int N = Integer.parseInt(br.readLine());
		int num = 0;
		
        // q에 N만큼의 수를 넣는다.
		for (int i = 0; i < N; i++) {
			q.add(Integer.parseInt(br.readLine()));
		}
		
        // q에 2개 이상 있어야지 비교 가능
		while (q.size() > 1) {
			int temp1 = q.poll();
			int temp2 = q.poll();
			
			num += temp1 + temp2;
			q.add(temp1 + temp2);
		}
		
		System.out.println(num);
	}

}
