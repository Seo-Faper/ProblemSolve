
import java.util.Arrays;

public class Ex55 {
	public static void main(String[] args) {
		int num = 1000000;
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
			 System.out.println(e);
		 });
	}
}
