import java.util.ArrayList;
import java.util.Scanner;

public class Ex53 {
	public static void main(String[] args) {
		//∞ÒµÂπŸ»Â¿« √ﬂ√¯
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
		for(int k = 2; k<list.size(); k++) {
			for(int i = k-1; i<list.size(); i++) {
				if(list.get(i)%k==0) {
					list.remove(i);
				}	
			}
		}
	//	System.out.println(list);
		for(int i =0; i<n; i++) {
			solution(arr[i],list);
		}
	
	}

	private static void solution(int n, ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		int a = 0;
		int index = 0;
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i)<n) {
				a = list.get(i);
				index = i;
			}
			else break;
		}
		System.out.println(a);
	}
}
