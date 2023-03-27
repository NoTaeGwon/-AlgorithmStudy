import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 수 입력

        while (t-- > 0) { // t번 반복
            String input = br.readLine(); 
            Stack<Character> left = new Stack<>(); // 왼쪽 스택
            Stack<Character> right = new Stack<>(); // 오른쪽 스택

            for (char ch : input.toCharArray()) { // 입력 문자열의 각 문자에 대해 반복
                if (ch == '<') { // '<' 문자가 입력된 경우
                    if (!left.isEmpty()) { // 왼쪽 스택이 비어있지 않은 경우
                        right.push(left.pop()); // 왼쪽 스택에서 가장 최근에 넣은 문자를 오른쪽 스택으로 옮김
                    }
                } else if (ch == '>') { // '>' 문자가 입력된 경우
                    if (!right.isEmpty()) { // 오른쪽 스택이 비어있지 않은 경우
                        left.push(right.pop()); // 오른쪽 스택에서 가장 최근에 넣은 문자를 왼쪽 스택으로 옮김
                    }
                } else if (ch == '-') { // '-' 문자가 입력된 경우
                    if (!left.isEmpty()) { // 왼쪽 스택이 비어있지 않은 경우
                        left.pop(); // 왼쪽 스택에서 가장 최근에 넣은 문자를 제거
                    }
                } else { // 그 외의 경우 (알파벳 등 문자가 입력된 경우)
                    left.push(ch); // 왼쪽 스택에 문자를 추가
                }
            }

            while (!left.isEmpty()) { // 왼쪽 스택에 남은 문자를 모두 오른쪽 스택으로 옮김
                right.push(left.pop());
            }

            StringBuilder sb = new StringBuilder();
            while (!right.isEmpty()) { // 오른쪽 스택에서 문자를 하나씩 꺼내서 출력
                sb.append(right.pop());
            }
            
            System.out.println(sb);
        }
    }

}
