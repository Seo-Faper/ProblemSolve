import java.util.ArrayList;
import java.util.Scanner;

public class Ex49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(arr[i], max);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 2; i<=max; i++) list.add(i);
		for(int k = 2; k<list.size()/2; k++) {
			for(int i = k-1; i<list.size(); i++) {
				if(list.get(i)%k==0) {
					list.remove(i);
				}
			}
		}
	}
}
