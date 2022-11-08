
import java.util.Arrays;
import java.util.Scanner;

public class Ex56 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int num = sc.nextInt();
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
			 if(e>=m)
			 System.out.println(e);
		 });
	}
}
