import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][4];
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<4; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<4; j++) {
				if(arr[i][j]==0) {
					count++;
				}
			}
			switch(count) {
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
			default:
				System.out.println("E");
				break;
			}
			count = 0;
		}
	}
}
