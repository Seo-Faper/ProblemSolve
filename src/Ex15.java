import java.util.Scanner;

public class Ex15 {
 public static void main(String[] args) {
	 long start = System.currentTimeMillis();

	 
	Scanner sc  = new Scanner(System.in);
		long n = sc.nextLong();
		long count = 0;
		long sum = 2;
		while(true) {
			if(n<0) {
				break;
			}else if(n==0) {
				count--;
			}
			n -=sum;
			sum++;
			count++;
		}
		sc.close();
		System.out.println(count);
		long end = System.currentTimeMillis();

		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
 	}
}
