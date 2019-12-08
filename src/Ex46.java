import java.util.Scanner;

public class Ex46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int group = 1;
		for(int i = 2; i<=n; i+=6) {
			group++;
		}
	}
}
