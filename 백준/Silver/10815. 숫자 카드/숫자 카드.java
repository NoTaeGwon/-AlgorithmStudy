import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;							// 검색 범위의 첫 인덱스
		int pr = n - 1;						// 검색 범위의 끝 인덱스
		
		do {
			int pc = (pl + pr) / 2;			//중앙 요소의 인덱스
			if (a[pc] ==key)
				return pc;					// 검색 성공
			else if (a[pc] < key)
				pl = pc + 1;				// 검색 범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1;				// 검색 범위를 앞쪽 절반으로 좁힘
		}	while (pl <= pr);
			
		return -1;							// 검색 실패
	} 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			int j = binSearch(arr, N, num);
			
			if (j == -1) { // 값이 없으면 0
				bw.write("0 ");
			} 
			else { // 값이 있으면 1
				bw.write("1 ");
			}
			
		}
		
		br.close();
		bw.close();	
	}

}
