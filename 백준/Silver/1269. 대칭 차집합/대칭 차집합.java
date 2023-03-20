import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashSet<Integer> set = new HashSet<>();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		// a 만큼의 값을 HashSet에 삽입
		for (int i = 0; i < a; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		
		// b 만큼의 값을 HashSet에 삽입된 값과 비교
		for (int i = 0; i < b; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (set.contains(num)) {	// 만약 num이 HashSet에 있다면
				set.remove(num);	// HashSet안에 있는 num 값을 제거
			} else {	// 없으면 num 삽입
				set.add(num);
			}
		}
		
		bw.write(set.size() + "");
		
		bw.flush();
		bw.close();
	}

}
