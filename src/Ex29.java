import java.util.Arrays;
import java.util.Scanner;

public class Ex29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int max = arr[arr.length-1];
		int[] dfs = new int[max+1];
		for(int i = 1; i<dfs.length; i++) {
			dfs[i] = i;
		}
		for(int a : dfs) {
			System.out.print(a+" ");
		}
		int min = 2;
		
		
	}
}
