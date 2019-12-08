
import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bungee = String.valueOf(n).length();
		int k = 1;
		int answer = 0;
		for(int i = 1; i<bungee; i++) {
			answer += i*9*k;
			k*=10;
		}
		n -=k;
		answer += (n+1)*bungee;
		System.out.println(answer);
	}
}