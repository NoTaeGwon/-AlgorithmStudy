import java.util.*;

public class Main {
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;							// 검색 범위의 첫 인덱스
		int pr = n - 1;						// 검색 범위의 끝 인덱스
		
		do {
			int pc = (pl + pr) / 2;			//중앙 요소의 인덱스
			if (a[pc] == key)
				return pc;					// 검색 성공
			else if (a[pc] < key)
				pl = pc + 1;				// 검색 범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1;				// 검색 범위를 앞쪽 절반으로 좁힘
		}	while (pl <= pr);
			
		return -1;							// 검색 실패
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int [n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		// 이진검색은 정렬이 되어 있어야 한다.
		Arrays.sort(a);
		
		int m = sc.nextInt();
		
		// 찾으면 1, 없으면 0
		for (int i = 0; i < m; i++) {
			if (binSearch(a, n, sc.nextInt()) >= 0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
	
		}

	}

}
