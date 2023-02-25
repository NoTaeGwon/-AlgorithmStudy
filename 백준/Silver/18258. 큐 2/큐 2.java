import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Integer> q = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());

		while (N-- > 0) {
			StringTokenizer command= new StringTokenizer(br.readLine(), " ");
			
			switch (command.nextToken()) {
			
			case "push":
				// offer(): 큐의 맨 뒤에 요소를 추가
				q.offer(Integer.parseInt(command.nextToken()));
				break;	
			
			case "pop":
				// poll(): 가장 앞에 있는 요소를 삭제
				Integer item = q.poll();
				
				if (item == null) { // 만약 삭제할 원소가 없으면 -1 반환
					sb.append(-1).append('\n');
				}
				else {
					sb.append(item).append('\n');
				}
				break;
			
			case "size":
				sb.append(q.size()).append('\n');
				break;
				
			case "empty":
				if (q.isEmpty()) {
					sb.append(1).append('\n');
				}
				else {
					sb.append(0).append('\n');
				}
				break;
			
			case "front":
				// peek()은 큐에 꺼낼 요소가 없을 경우 null을 반환
				Integer item1 = q.peek();
				if(item1 == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(item1).append('\n');
				}
				break;
				
			case "back":
				// peekLast()은 큐에 꺼낼 요소가 없을 경우 null을 반환
				Integer item2 = q.peekLast();	 
				if(item2 == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(item2).append('\n');
				}
				break;
			}
		}
		
		System.out.println(sb);
		
	}

}
