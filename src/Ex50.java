import java.util.Scanner;

public class Ex50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(f(n));
	}

	private static int f(int n) {
		if(n>=2) {
			return f(n-1) + f(n-2);
		}else {
			if(n==0) return 0;
			return 1;
		}
		
	}
	
}
