import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int count = 0;
		
		// map에 N만큼의 문자열을 삽입한다.
		for (int i = 0; i < N; i++) {
			map.put(br.readLine(), 0);
		}
		
		// M만큼의 문자열을 받고 map과 비교해서 해당 문자열이 있으면 count해준다.
		for (int i = 0; i < M; i++) {
			if (map.containsKey(br.readLine())) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
