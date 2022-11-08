import java.util.Scanner;

public class Ex25{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		
		int round = 0;
		
		while(a != b) {
		
			a = a/2 + a%2;
			b = b/2 + b%2;
			
			round++;
		}
		System.out.println(round);
	}

}