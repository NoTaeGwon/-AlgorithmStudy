import java.util.Scanner;

public class Main {
	private static int num; 	// 큐 포인터
	private static int[] que; 	// 큐 본체
	
	// 큐에 x를 넣음
	public static int push(int x) {
		return que[num++] = x;
	}
	
	// 큐에서 데이터를 pop(가장 앞에 있는 데이터를 꺼냄)
	public static int pop() {
		if (num <= 0) {			// 큐가 비어 있음
			return -1;
		}
		
		int x = que[0];
		
		for (int i = 0; i < num - 1; i++) {
			que[i] = que[i + 1];
		}
		num--;
		return x;
	}
	
	// 큐에 쌓여 있는 데이터 수를 반환
	public static int size() {
		return num;
	}
		
	// 큐가 비어 있는가?
	public static int empty() {
		if (num <= 0) {			// 큐가 비어 있음
			return 1;
		}
		return 0;
	}
		
	// 큐에서 데이터를 프런트(가장 앞에 있는 정수를 출력)
	public static int front() {
		if (num <= 0) {			// 큐가 비어 있음
			return -1;
		}
		return que[0];
	}
	
	// 큐 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public static int back() {
		if (num <= 0) { 		// 큐가 비어 있음
			return -1;
		}
		return que[num - 1];
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = stdIn.nextInt(); // 명령의 개수
		
		que = new int[N];
		
		for (int i = 0; i < N; i++) {
			String str = stdIn.next();
			
			switch (str) {
			
			case "push":
				push(stdIn.nextInt());
				break;
			
			case "pop":
				sb.append(pop()).append('\n');
				break;
				
			case "size":
				sb.append(size()).append('\n');
				break;
				
			case "empty":
				sb.append(empty()).append('\n');
				break;
				
			case "front":
				sb.append(front()).append('\n');
				break;
				
			case "back":
				sb.append(back()).append('\n');
				break;
			}
				
		}
		System.out.println(sb);
	}

}
