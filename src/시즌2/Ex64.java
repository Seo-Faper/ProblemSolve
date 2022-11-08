import java.util.Arrays;
import java.util.Scanner;

public class Ex64 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		/*
		 * 4 7
		 * 10 15 17 20
		 */
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = sc.nextInt();
		Arrays.parallelSort(arr);
		int min = arr[0];
		int sum = 0;
		for(int i = 0; i<n; i++) sum += arr[i] -min;
		//System.out.println(sum);
		if(m>sum) {
			//최소 값 보다 작은 경우, arr을 합친 값에서 m을 빼고 4로 나누면 된다. -> 빼도 음수가 되는 경우가 없기에. 
			int tmp = 0;
			for(int i = 0; i<n; i++)	tmp +=arr[i];
			System.out.println((tmp-m)/4);
		}else {
			//System.out.println(sum+","+arr[n-1]);
			for(int i = min; i<=arr[n-1]; i++) {
				int tmp = 0;
				for(int j = 0; j<n; j++) {
					if(arr[j]-i>0) tmp += arr[j] - i; 
				}
				//System.out.println(tmp);
				if(tmp==m) System.out.println(i);
			}
		}
	}
}
