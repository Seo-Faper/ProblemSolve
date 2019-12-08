import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(f(sc.nextInt()));
	}
	public static int f(int n) {
		if(n==0) {
			return 1;
		}
		if (n <= 1)

			return n;

		else 

			return f(n-1) * n;
	}
}
