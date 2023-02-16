import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static int lowerBound(int[] arr, int key) {
		int low = 0;
		int hight = arr.length;
		
		// low값이 hight값이랑 같아질 때 까지 반복
		while (low < hight) {
			int mid = (low + hight) / 2; // 중간위치를 구함
			
			if (key <= arr[mid]) {	// 만약 key 값이 중간 값보다 작거나 같을 경우
				hight = mid;	// 중복 원소에 대해 왼쪽으로 탐색하도록 hight 값을 내림
			}
 
			else {
				low = mid + 1;
			}
		}
		
		return low;
	}
	
	public static int upperBound(int[] arr, int key) {
		int low = 0;
		int hight = arr.length;
		
		while (low < hight) {
			int mid = (low + hight) / 2;
			
			if (key < arr[mid]) { 
				hight = mid;
			}
			
			else {
				low = mid + 1;
			}
		}
		return low;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());
			sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
		}
		
		System.out.println(sb);
	}

}
