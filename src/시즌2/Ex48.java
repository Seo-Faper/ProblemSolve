import java.util.ArrayList;
import java.util.Scanner;

public class Ex48 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 2; i<=m; i++) list.add(i);
		for(int k = 2; k<list.size()/2; k++) {
			for(int i = k-1; i<list.size(); i++) {
				if(list.get(i)%k==0) {
					list.remove(i);
				}
			}
		}
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i)>=n) {
			System.out.println(list.get(i));
			}
		}
	}
}
