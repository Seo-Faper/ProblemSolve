import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 1;
		int line = 1;
		while(true) {
			if(sum>=n) {
				break;
			}
			line++;
			sum +=line;
		}
		int child = 0;

		int parent = 0;



		// ÇØ´ç ´ë°¢¼± È¦,Â¦ ÆÇº°

		if (line % 2 == 0) {

			int start = sum;

			int sub = start-n;

			child = line - sub;

			parent = 1 + sub;

		}



		if (line % 2 == 1) {

			int end = sum;

			int sub = end-n;

			child = 1 + sub;

			parent = line - sub;

		}



		System.out.println(child+"/"+parent);
	}
}
