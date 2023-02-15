import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			LinkedList<int[]> Q = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < N; i++) {
				// { 위치, 중요도 }
				Q.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
			}
			
			int count = 0; // (프린터)출력 횟수
			
			while (!Q.isEmpty()) {
				int [] front = Q.poll();	// 첫 원소
				boolean isMax = true;		// front 원소가 가장 큰 원소인지 판단
				
				// 큐에 있는 원소들과 중요도 비교
				for (int i = 0; i < Q.size(); i++) {
					// 처음 뽑은 원소보다 큐에 있는 i번째 원소가 중요도가 클 경우
					if (front[1] < Q.get(i)[1]) {
						// 뽑은 원소 와 i이전의 원소들을 뒤로 보냄
						Q.offer(front);
						for (int j = 0; j < i; j++ ) {
							Q.offer(Q.poll());
						}
						// front 원소가 가장 큰 원소가 아니였으므로 false를 하고 탐색 끝
						isMax = false;
						break;
					}
				}
				
				// front 원소가 가장 큰 원소가 아니였으므로 다음 반복으로 넘어감
				if (isMax == false) {
					continue;
				}
				
				// front 원소가 가장 큰 원소이면 출력
				count++;
				
				// 찾고자 하는 문서라면 해당 테스트 케이스 종료
				if (front[0] == M) {
					break;
				}
			}
			sb.append(count).append('\n');
			
		}
		System.out.println(sb);

	}

}
