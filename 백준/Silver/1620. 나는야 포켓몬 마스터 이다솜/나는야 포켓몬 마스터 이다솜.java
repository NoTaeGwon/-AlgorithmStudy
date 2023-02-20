import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	//입력받은 값이 숫자인지 판별
	public static boolean isInteger(String str) {
		try { //숫자라면 true
			Integer.parseInt(str);
			return true;	
		} catch(NumberFormatException e) { //숫자가 아니라면 false
			return false;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> mapStr = new HashMap<String, Integer>();
		HashMap<Integer, String> mapInt = new HashMap<Integer, String>(); 
		
		// 이름, 숫자를 map에 각각 저장
		for (int i = 1; i <= N; i++) {
			String poketmon = br.readLine();
			mapStr.put(poketmon, i);
			mapInt.put(i, poketmon);
		}
		
		for (int i = 0; i < M; i++) {
			String answer = br.readLine();
			
			if (isInteger(answer)) { // answer가 숫자라면
				int num = Integer.parseInt(answer); // int로 변환
				sb.append(mapInt.get(num)).append("\n"); 
			}
			else {	// answer가 문자열이라면
				sb.append(mapStr.get(answer)).append("\n");
			}
			
		}
	
		System.out.println(sb);
	}

}
