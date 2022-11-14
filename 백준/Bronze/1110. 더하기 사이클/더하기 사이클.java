import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0; 
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt(); 
		int copy = num; 
		
		while(true) {
			num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10); // 1의 자리수와 10의 자리 수를 구함
		
			count++;
			if (copy == num){
				break;
			}	
	
		}
		System.out.print(count);
	}

}
