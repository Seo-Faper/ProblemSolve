import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[5];
	for(int i = 0; i<5; i++) {
		arr[i] = sc.nextInt();
		}
	System.out.println(Arrays.stream(arr).filter(e -> e==n).count());
	}
}
