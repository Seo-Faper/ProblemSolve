import java.util.ArrayList;
import java.util.Scanner;

public class Ex14 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	ArrayList<Integer> list = new ArrayList<Integer>();
	for(int i = 0; i<n-2; i++) {
		list.add(i+2);
	}
	int count = 0;
	while(true) {
		
		int min = list.get(0);
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i)/min==0) {
				list.set(i, 0);
				count++;
			}
		}
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i)==0) {
				list.remove(i);
			}
		}
		if(count==k) {
			break;
		}
	}
	System.out.println(count);
	}
}
	
