import java.util.Arrays;
import java.util.Scanner;

public class Ex26 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] bit = new int[7];
	for(int i = 0; i<7; i++) {
		bit[i] = n%2;
		n /=2;
	}
	long a = Arrays.stream(bit).filter(e -> e==1).count();
	System.out.println(a);
	}
}
