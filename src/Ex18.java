import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int f = sc.nextInt();
		int c = sc.nextInt();
		int n = (e+f);
		while(true) {
			if(n/c<1) {
				break;
			}
			n /= c;
		}
		System.out.println(n);
	}
}