import java.util.Arrays;
import java.util.Scanner;

public class Ex61 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			System.out.println(f(n));
		}

	
	}
	static int count = 0;
	public static int f(int n) {
		int num = 2*n;
		count = 0;
		int[] arr = new int[num+1];
		for(int i = 2; i<=num; i++) {
			arr[i] = i;
		}
		 for (int i = 2; i <= Math.sqrt(num); i++) { 

		        if (arr[i] == 0)
		            continue;
		        for(int j = i + i; j <= num; j += i) {
		            arr[j] = 0;
		        }

		    }
		 Arrays.stream(arr).filter(e-> e !=0).forEach(e->{
			 if(e>n) {
				 count++;
				// System.out.println(e);
			 }
		 });
		 return count;
	}
}
