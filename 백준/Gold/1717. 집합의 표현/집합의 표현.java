import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	
	// x의 부모를 찾는 연산
	public static int find(int x) {
		if (x == parent[x]) {
			return x;
		}
		return parent[x] = find(parent[x]);
	}
	
	// y의 부모를 x의 부모로 치환하는 연산 (x > y 일 경우, 반대)
    public static void union(int x, int y) {
        x = find(x);
        y = find(y);
 
        if (x != y) {
            if (x < y) {
                parent[y] = x;
            } else {
                parent[x] = y;
            }
        }
    }
    
    // x와 y의 부모가 같은지 확인
    public static boolean isSameParent(int x, int y) {
        x = find(x);
        y = find(y);
 
        if (x == y) {
            return true;
        }
 
        return false;
    }    
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 집합의 수
		int M = Integer.parseInt(st.nextToken()); // 연산의 수
		
		parent = new int[N + 1];
		
		for (int i = 1; i <= N; i++) {
			parent[i] = i;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int commend = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if (commend == 0) {
				union(a, b);
			} else if (commend == 1) {
				sb.append(isSameParent(a, b) ?  "YES" : "NO").append('\n');
			} else {
				continue;
			}
		}
		
		System.out.println(sb);
	}

}
