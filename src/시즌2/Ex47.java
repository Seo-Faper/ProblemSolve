import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[n-1];
		for(int i = 2; i<=max; i++) list.add(i);
		
		
		for(int k = 2; k<list.size(); k++) {
			for(int i = k-1; i<list.size(); i++) {
				if(list.get(i)%k==0) {
				//	System.out.println(list.get(i));
					list.remove(i);
				}
			}
		}
	//	System.out.println(list);
		int answer = 0;
		for(int i = 0; i<list.size(); i++) {
			for(int j = 0; j<arr.length; j++) {
				if(list.get(i)==arr[j]) answer++;
			}
		}
		System.out.println(answer);
	}
}
