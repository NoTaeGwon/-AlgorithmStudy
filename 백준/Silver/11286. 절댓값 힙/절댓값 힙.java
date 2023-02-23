import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(new Comparator<Integer>() {
            
			// 절대값 기준으로 q를 배열한다.
			public int compare(Integer o1, Integer o2) {
	
				// 절대값 기준으로 앞 값이 더 크다면 자리를 바꿔준다.
				if (Math.abs(o1) > Math.abs(o2)) {
					return Math.abs(o1) - Math.abs(o2);
				}
				
				// 절대값 기준으로 두 값이 같다면 음수를 앞으로 보내준다.
				else if (Math.abs(o1) == Math.abs(o2)) {
					return o1 - o2;
				} 
				
				else {
					return -1;
				}
			}
		});
		
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			// 만약 0이 일력 되면
			if (num == 0) {
				
				// q가 비어 있으면 0을 출력
				if (q.isEmpty()) {
					sb.append("0").append("\n");
				} 
                
				// q에서 절대값이 가장 작은 값을 출력
				else {
					sb.append(q.poll()).append("\n");
				}
                
			// 만약 num의 값이 0이 아니라면 q에 num값 을 넣는다.
			} else {
				q.offer(num);
			}
		}
		
		System.out.println(sb);

	}

}
