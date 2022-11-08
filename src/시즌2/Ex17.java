import java.util.Scanner;

public class Ex17 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[10];
	for(int i = 0; i<10; i++) {
		arr[i] = sc.nextInt();
	}
	int sum = 0;
	for(int i = 0; i<10; i++) {
		sum +=arr[i];
		if(sum==100) {
			break;
		}
		//System.out.println(sum);
		if(sum>100) {
			int a = sum-arr[i];
			if(100-a < sum-100) {
				sum = a;
				break;
			}else {
				break;
			}
		}
	}
	
	System.out.println(sum);
 }
}
