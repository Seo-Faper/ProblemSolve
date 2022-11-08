import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex62 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.println(f(sc.nextInt()));
		}
	}

	private static String f(int n) {
		// TODO Auto-generated method stub
		int a = n/2;
		int b = n/2;
		int num = n;
		int[] arr = new int[num+1];
		ArrayList<Integer> list = new ArrayList<Integer>();
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
			list.add(e);
		 });
		
		 while(true) {
			 if(list.contains(a)&&list.contains(b)) break;
			 else {
				 a--;
				 b++;
			 }
		 }
		 
		return a+" "+b;
	}
}
