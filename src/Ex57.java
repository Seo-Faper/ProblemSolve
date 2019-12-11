import java.util.Scanner;

public class Ex57 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {
			System.out.println("1");
		}else {
			int start = 2;
			int count = 1;
			boolean flag = false;
			while(true) {
				if(flag) break;
				int last = start + 6*(count);
				for(int i = start; i<last; i++) {
				//	System.out.println(i);
					if(i==n) { flag = true;
						System.out.println(count+1);
					}
				}
			//	System.out.println("----");
				start = last;
				count++;
			}
		}
		


		
	}
	
}
