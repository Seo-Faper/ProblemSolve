import java.util.Scanner;

public class Ex23 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = f(n);
		int init = f(n);
		int count = 0;
		while(true) {
			k = f(k);
			count++;
			if(init == k) {
				break;
			}
			
		}
		System.out.println(count);
	 }
	 public static int f(int n) {
		 
		 return (n/10+n%10)%10+(10*(n%10));
	 }
}
