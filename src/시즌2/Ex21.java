import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = new int[28];	
		for(int i = 0; i<28; i++) {
				arr[i] = sc.nextInt();
			}
		sc.close();
		Arrays.sort(arr);
		for(int i = 1; i<=30; i++) {
			list.add(i);
		}
		int index = 0;
		while(true) {
			if(list.size()==2) {
				break;
			}
			if(arr[index]==list.get(index)) {
				list.remove(index);
			}
			
		}
		for(int a : list) {
			System.out.println(a);
		}
	}
}
