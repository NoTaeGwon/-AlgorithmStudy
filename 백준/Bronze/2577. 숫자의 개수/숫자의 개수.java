import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int val = A * B * C;
		
		int[] arr = new int[10];
		
		while(val != 0) {
			arr[val % 10] ++;
			val /= 10;
		}
		
		for (int result : arr) {
			System.out.println(result);
		}
		
	}

}