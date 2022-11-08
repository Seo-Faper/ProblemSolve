import java.util.Scanner;

public class Ex63 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		
		int answer = Math.min(a1-a,a);
		answer = Math.min(answer,Math.min(b1-b,b));
        System.out.println(answer);
	}
}
