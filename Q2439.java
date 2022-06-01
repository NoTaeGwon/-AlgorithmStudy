import java.util.Scanner;
public class Q2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int starCount;
		Scanner sc = new Scanner(System.in);
		starCount = sc.nextInt();
		
		for(int x = 1; x <= starCount; x++) {
			for(int y = starCount; y > x; y--) {
				System.out.print(" ");
			}
			for (int a = 0; a < x; a++) {
				System.out.print("*");
			}
			System.out.println(" ");
			}
		

	}

}
