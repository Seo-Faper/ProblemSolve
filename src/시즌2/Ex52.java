import java.util.Scanner;

public class Ex52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int m = sc.nextInt();
		/*
		 * 
>>4 2
1 2
1 3
1 4
2 1
2 3
2 4
3 1
3 2
3 4
4 1
4 2
4 3
		 * 
		 */
	f(n,m);
	}

	private static void f(int n, int m) {
		// TODO Auto-generated method stub
		for(int i = 0; i<=n; i++) {
			System.out.print(i);
		}
	}
}
