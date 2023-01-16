import java.util.Scanner;
	
public class Main {
	private static int size = 0; // 스택 용량
	private static int[] stk; 	// 스택 본체
	
	// 정수 X를 스택에 넣는 연산이다.
	public static void push(int x) {
		stk[size++] = x;
	}
	
	// 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static int pop() {
		if (size <= 0) {			// 스택이 비어 있음
			return -1;
		}
		return stk[--size];
	}
	
	// 스택에 들어있는 정수의 개수를 출력한다.
	public static int size() {
		return size;
	}
	
	// 스택이 비어있으면 1, 아니면 0을 출력한다.
	public static int empty() {
		if(size == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	// 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static int top() {
		if(size == 0) {
			return -1;
		}
		else {
			return stk[size - 1];
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// System.out.println을 일일이 쓰면 시간 초과 발생
		StringBuilder sb = new StringBuilder();
		
		int N = stdIn.nextInt(); // 스택의 용량을 받는 변수
		stk = new int[N]; 
		
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
				
			case "top":
				sb.append(top()).append('\n');
				break;
				
			}
				
		}
		System.out.println(sb);

	}

}
